package cl.todogiftcard.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.todogiftcard.dao.TokenDAO;
import cl.todogiftcard.dao.entities.BitacoraLoginEntity;

@Repository
@Transactional
public class TokenDAOImpl implements TokenDAO {
	
	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public List<BitacoraLoginEntity> findAll() {
		// query
		final Query query = entityManager.createQuery(
				"select b from BitacoraLoginEntity b where b.activo = true");
		// retorno
		return query.getResultList();
	}

	@Override
	public BitacoraLoginEntity findById(Long idSession) {
		// retorno
		BitacoraLoginEntity retorno = null;
		// query
		final Query query = entityManager.createQuery(
				"select b from BitacoraLoginEntity b where b.activo = true and b.idSession = :id ");
		// params
		query.setParameter("id", idSession);
		// result
		final List<BitacoraLoginEntity> data = query.getResultList();
		if (!data.isEmpty()) {
			retorno = data.get(0);
		}
		// retorno
		return retorno;
	}

	@Override
	public BitacoraLoginEntity findByUserToken(final String token, final Long idUsuario) {
		// retorno
		BitacoraLoginEntity retorno = null;
		// query
		final Query query = entityManager.createQuery(
		"select b from BitacoraLoginEntity b where b.activo = true and b.token = :token and b.user.idUsuario = :idUsuario ");
		// params
		query.setParameter("token", token);
		query.setParameter("idUsuario", idUsuario);
		// result
		final List<BitacoraLoginEntity> data = query.getResultList();
		if (!data.isEmpty()) {
			retorno = data.get(0);
		}
		// retorno
		return retorno;
	}

	@Override
	public long persist(final BitacoraLoginEntity entity) {
		// insert
		entityManager.persist(entity);
		// retorno
		return entity.getIdSession();
	}

	@Override
	public void update(BitacoraLoginEntity entity) {
		// update
		entityManager.merge(entity);
	}

	@Override
	public void delete(BitacoraLoginEntity entity) {
		// delete
		entityManager.remove(entity);
	}

}
