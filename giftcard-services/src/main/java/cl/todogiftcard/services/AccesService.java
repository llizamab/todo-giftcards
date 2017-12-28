package cl.todogiftcard.services;

import cl.todogiftcard.dto.User;
import cl.todogiftcard.dto.Token;

public interface AccesService {

	boolean loginUser(final String email, final String password);
	
	User findUserById(final Long id);
	
	User findUserByEmail(final String email);
	
	String generateUserToken(final Long idUser);
	
	Token findTokenByUserId(final Long idUser);
}
