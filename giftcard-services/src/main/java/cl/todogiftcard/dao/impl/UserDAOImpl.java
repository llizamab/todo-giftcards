package cl.todogiftcard.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.todogiftcard.dao.UserDAO;
import cl.todogiftcard.dao.entities.UserEntity;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public List<UserEntity> findAll() {
		// query
		final Query query = entityManager.createQuery(
				"select u from UserEntity u where u.activo = true");
		// retorno
		return query.getResultList();
	}

	@Override
	public UserEntity findById(final Long id) {
		// retorno
		UserEntity retorno = null;
		// query
		final Query query = entityManager.createQuery(
				"select u from UserEntity u where u.activo = true and u.idUsuario = :id ");
		// parameter
		query.setParameter("id", id);
		// execute
		final List<UserEntity> data = query.getResultList();
		if (!data.isEmpty()) {
			retorno = data.get(0);
		}
		// retorno
		return retorno;
	}

	@Override
	public UserEntity findByEmail(String email) {
		// retorno
		UserEntity retorno = null;
		// query
		final Query query = entityManager.createQuery(
			"select u from UserEntity u where u.activo = true and u.email = :email and u.emailValido = true ");
		// parameter
		query.setParameter("email", email);
		// execute
		final List<UserEntity> data = query.getResultList();
		if (!data.isEmpty()) {
			retorno = data.get(0);
		}
		// retorno
		return retorno;
	}

	

}
