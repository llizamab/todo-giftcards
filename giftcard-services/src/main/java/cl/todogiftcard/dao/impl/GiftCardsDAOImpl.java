package cl.todogiftcard.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.todogiftcard.dao.GiftCardsDAO;
import cl.todogiftcard.dao.entities.GiftCardEntity;

@Repository
@Transactional
public class GiftCardsDAOImpl implements GiftCardsDAO {
	
	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public List<GiftCardEntity> findAll() {
		// 
		final Query query = entityManager.createQuery("select g from GiftCardEntity g ");
		// execute
		return query.getResultList();
	}

}
