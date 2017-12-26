package cl.todogiftcard.services;

import java.util.List;

import cl.todogiftcard.dto.GiftCard;

public interface GiftCardsService {

	/** Find all.
	 * @return the list
	 */
	List<GiftCard> findAll();
}
