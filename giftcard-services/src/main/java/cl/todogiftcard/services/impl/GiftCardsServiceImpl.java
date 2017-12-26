package cl.todogiftcard.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.todogiftcard.dao.GiftCardsDAO;
import cl.todogiftcard.dao.entities.GiftCardEntity;
import cl.todogiftcard.dto.GiftCard;
import cl.todogiftcard.services.GiftCardsService;

@Service
public class GiftCardsServiceImpl implements GiftCardsService {
	
	@Autowired
	private GiftCardsDAO dao;

	@Override
	public List<GiftCard> findAll() {
		// retorno
		final List<GiftCard> retorno = new ArrayList<>();
		// call bbdd
		final List<GiftCardEntity> data = dao.findAll();
		// por cada
		for (final GiftCardEntity entity : data) {
			
			final GiftCard giftcard = new GiftCard(entity.getIdGiftCard(), entity.getNombreGiftCard());
			retorno.add(giftcard);
		}
		
		// retunr
		return retorno;
	}

}
