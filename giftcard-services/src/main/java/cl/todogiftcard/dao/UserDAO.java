package cl.todogiftcard.dao;

import java.util.List;

import cl.todogiftcard.dao.entities.UserEntity;

public interface UserDAO {

	public List<UserEntity> findAll();
	
	public UserEntity findById(final Long id);
	
	public UserEntity findByEmail(final String email);
}
