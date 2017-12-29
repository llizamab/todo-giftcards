package cl.todogiftcard.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.todogiftcard.dto.User;
import cl.todogiftcard.services.AccesService;

@RequestMapping("/access")
@RestController
@PropertySource(value = { "classpath:application.properties" })
public class AccesController {
	
	private static final Logger logger = Logger.getLogger(AccesController.class.getName());
	
	@Autowired
	private AccesService service;
	
	@RequestMapping (value="/loginUser", 
			method=RequestMethod.POST, 
			produces="application/json", 
			headers ="Accept=application/json"
			)
	public ResponseEntity<Map<String, Object>> loginUser(@RequestParam(value="email") String email, 
				@RequestParam(value="password") String password) {
		
		logger.info("INI request on loginUser");
		HttpStatus httpStatus = null;
		final Map<String, Object> data = new HashMap<>();
		// llamar al service
		try {
			// si el login es valido
			if (service.loginUser(email, password)) {
				// obtengo el user
				final User user = service.findUserByEmail(email);
				// genero el token
				final String token = service.generateUserToken(user.getIdUsuario());
				// guardo los datos
				data.put("status", "OK");
				data.put("token", token);
				data.put("user", user);
				
			} else {
				// error
				data.put("status", "KO");
				data.put("error", "Usuario/Password invalidos");
			}
			
			httpStatus = HttpStatus.ACCEPTED;
			
		} catch (final Exception error) {
			logger.info("ERROR on loginUser: " + error);
			logger.info(error.getLocalizedMessage());
			httpStatus = HttpStatus.SERVICE_UNAVAILABLE;
			// error
			data.put("status", "KO");
			data.put("error", "Exception: " + error.getLocalizedMessage());
		}
		logger.info("FIN request on loginUser with: " + data);
		// retorno
		return new ResponseEntity<>(data, httpStatus);
	}

	@RequestMapping (value="/logoutUser", 
			method=RequestMethod.POST, 
			produces="application/json", 
			headers ="Accept=application/json"
			)
	public ResponseEntity<Map<String, Object>> logoutUser(@RequestParam(value="userId") Long userId, 
				@RequestParam(value="token") String token) {
		logger.info("INI request on logoutUser");
		HttpStatus httpStatus = null;
		final Map<String, Object> data = new HashMap<>();
		// llamar al service
		try {
			// si el logout es valido
			if (service.logoutUser(userId, token)) {
				// guardo los datos
				data.put("status", "OK");
				
			} else {
				// error
				data.put("status", "KO");
				data.put("error", "Usuario/Token no existen");
			}
			
			httpStatus = HttpStatus.ACCEPTED;
			
		} catch (final Exception error) {
			logger.info("ERROR on logoutUser: " + error);
			logger.info(error.getLocalizedMessage());
			httpStatus = HttpStatus.SERVICE_UNAVAILABLE;
			// error
			data.put("status", "KO");
			data.put("error", "Exception: " + error.getLocalizedMessage());
		}
		logger.info("FIN request on logoutUser with: " + data);
		// retorno
		return new ResponseEntity<>(data, httpStatus);
	}
}
