package cl.todogiftcard.dao;

import java.util.List;

import cl.todogiftcard.dao.entities.BitacoraLoginEntity;

public interface TokenDAO {

	public List<BitacoraLoginEntity> findAll();
	
	public BitacoraLoginEntity findById(final Long idSession);
	
	public BitacoraLoginEntity findByUserToken(final String token, final Long idUsuario);
	
	public long persist(BitacoraLoginEntity entity);
	
	public void update(BitacoraLoginEntity entity);
	
	public void delete(BitacoraLoginEntity entity);
}
