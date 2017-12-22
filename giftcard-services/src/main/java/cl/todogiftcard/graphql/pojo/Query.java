package cl.todogiftcard.graphql.pojo;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Query implements GraphQLRootResolver {

	private final GiftCardRepository linkRepository;

    public Query(GiftCardRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<GiftCard> allGiftCards() {
        return linkRepository.getAllGiftCards();
    }
}
