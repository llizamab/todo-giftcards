package cl.todogiftcard.services.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.todogiftcard.Utils;
import cl.todogiftcard.dao.TokenDAO;
import cl.todogiftcard.dao.UserDAO;
import cl.todogiftcard.dao.entities.BitacoraLoginEntity;
import cl.todogiftcard.dao.entities.UserEntity;
import cl.todogiftcard.dto.Token;
import cl.todogiftcard.dto.User;
import cl.todogiftcard.services.AccesService;

@Service
public class AccesServiceImpl implements AccesService {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private TokenDAO tokenDao;

	@Override
	public boolean loginUser(String email, String password) {
		// retorno
		boolean valido = false;
		// valido formato email y pass
		if (Utils.validarEmail(email) && password != null 
				&& !password.trim().isEmpty()) {
			// busco el usuario
			final UserEntity user = userDao.findByEmail(email);
			// si el usuario existe, valido el mail, y coindice la contraseña
			if (user != null && user.isEmailValido() 
				&& user.getPassword().equals(Utils.encrypt(password))) {
				// valido
				valido = true;
			}
		}
		// retorno si es valido
		return valido;
	}

	@Override
	public boolean logoutUser(Long idUser, String token) {
		// retorno
		boolean valido = false;
		// si el token existe
		final BitacoraLoginEntity tokenEnt = tokenDao.findByUserToken(token, idUser);
		// si no es null
		if (tokenEnt != null) {
			// lo inactivo
			tokenEnt.setActivo(false);
			// y actualizo
			tokenDao.update(tokenEnt);
			valido = true;
		}
		return valido;
	}

	@Override
	public User findUserById(Long id) {
		// retorno
		User user = null;
		if (id != null) {
			// busco el usuario
			final UserEntity userEntity = userDao.findById(id);
			if (userEntity != null) {
				user = new User();
				user.setIdUsuario(userEntity.getIdUsuario());
				user.setNombreUsuario(userEntity.getUserName());
				user.setApellidos(userEntity.getApellidos());
				user.setCelular(userEntity.getCelular());
				user.setEmail(userEntity.getEmail());
				user.setEmailValido(userEntity.isEmailValido());
				user.setNombres(userEntity.getNombres());
				user.setRut(userEntity.getRut());
				user.setTelefono(userEntity.getTelefono());
//				user.setPassword(userEntity.getPassword());
			}
		}
		return user;
	}

	@Override
	public User findUserByEmail(String email) {
		// retorno
		User user = null;
		if (email != null && !email.trim().isEmpty()) {
			// busco el usuario
			final UserEntity userEntity = userDao.findByEmail(email);
			if (userEntity != null) {
				user = new User();
				user.setIdUsuario(userEntity.getIdUsuario());
				user.setNombreUsuario(userEntity.getUserName());
				user.setApellidos(userEntity.getApellidos());
				user.setCelular(userEntity.getCelular());
				user.setEmail(userEntity.getEmail());
				user.setEmailValido(userEntity.isEmailValido());
				user.setNombres(userEntity.getNombres());
				user.setRut(userEntity.getRut());
				user.setTelefono(userEntity.getTelefono());
//				user.setPassword(userEntity.getPassword());
			}
		}
		return user;
	}

	@Override
	public String generateUserToken(Long idUser) {
		// retorno
		final BitacoraLoginEntity entity = new BitacoraLoginEntity();
		// generate token
		entity.setToken(Utils.generateRandomString(20));
		entity.setUser(userDao.findById(idUser));
		entity.setInicioSession(Calendar.getInstance());
		// doy 10 minutos de sesion
		final Calendar exp = Calendar.getInstance();
		exp.add(Calendar.MINUTE, +10);
		entity.setExpiracionSession(exp);
		entity.setActivo(true);
		// creo el registro
		tokenDao.persist(entity);
		// retorno
		return entity.getToken();
	}

	@Override
	public Token findTokenByUserId(Long idUser) {
		// TODO Auto-generated method stub
		return null;
	}
}
