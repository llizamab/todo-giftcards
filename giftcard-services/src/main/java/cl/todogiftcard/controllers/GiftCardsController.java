package cl.todogiftcard.controllers;

import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Service
@RequestMapping("/giftcards")
@PropertySource(value = { "classpath:application.properties" })
public class GiftCardsController {

	
	@RequestMapping (value="/findAll", 
			method=RequestMethod.GET, 
			produces="application/json", 
			headers ="Accept=application/json")
	public ResponseEntity<String> findAllGiftCards(@RequestParam ("token") String token) {
		
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
}
