package cl.todogiftcard.graphql.pojo;

import java.util.ArrayList;
import java.util.List;

public class GiftCardRepository {
	private final List<GiftCard> giftcards;

    public GiftCardRepository() {
        giftcards = new ArrayList<>();
        //add some links to start off with
        giftcards.add(new GiftCard("123", "Your favorite GraphQL page"));
        giftcards.add(new GiftCard("456", "The official docks"));
    }

    public List<GiftCard> getAllGiftCards() {
        return giftcards;
    }
    
}
