package cl.todogiftcard.dao;

import java.util.List;

import cl.todogiftcard.dao.entities.GiftCardEntity;

public interface GiftCardsDAO {

	public List<GiftCardEntity> findAll();
}
