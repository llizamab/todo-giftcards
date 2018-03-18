package cl.todogiftcard.controllers;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.todogiftcard.dto.GiftCard;
import cl.todogiftcard.services.GiftCardsService;

@CrossOrigin
@RequestMapping("/giftcards")
@RestController
@PropertySource(value = { "classpath:application.properties" })
public class GiftCardsController {
	
	private static final Logger logger = Logger.getLogger(GiftCardsController.class.getName());
	
	@Autowired
	private GiftCardsService service;
	
	@RequestMapping (value="/findAll", 
			method=RequestMethod.GET, 
			produces="application/json", 
			headers ="Accept=application/json"
			)
	public ResponseEntity<List<GiftCard>> findAllGiftCards(@RequestParam(value="token", defaultValue="") String token) {
		
		logger.info("INI request on findAllGiftCards");
		HttpStatus httpStatus = null;
		List<GiftCard> data = null;
		// llamar al service
		try {
			
			data = service.findAll();
			httpStatus = HttpStatus.ACCEPTED;
			
		} catch (final Exception error) {
			logger.info("ERROR on findAllGiftCards: " + error);
			httpStatus = HttpStatus.SERVICE_UNAVAILABLE;
		}
		logger.info("FIN request on findAllGiftCards with: " + data);
		return new ResponseEntity<>(data, httpStatus);
	}
	
	@RequestMapping (value="/findById", 
			method=RequestMethod.GET, 
			produces="application/json", 
			headers ="Accept=application/json"
			)
	public ResponseEntity<GiftCard> findGiftCardById(@RequestParam(value="id") Long id, @RequestParam(value="token", defaultValue="") String token) {
		logger.info("INI request on findGiftCardById");
		HttpStatus httpStatus = null;
		GiftCard data = null;
		// llamar al service
		try {
			
			data = service.findById(id);
			httpStatus = HttpStatus.ACCEPTED;
			
		} catch (final Exception error) {
			logger.info("ERROR on findGiftCardById: " + error);
			httpStatus = HttpStatus.SERVICE_UNAVAILABLE;
		}
		logger.info("FIN request on findGiftCardById with: " + data);
		return new ResponseEntity<>(data, httpStatus);
	}
}
