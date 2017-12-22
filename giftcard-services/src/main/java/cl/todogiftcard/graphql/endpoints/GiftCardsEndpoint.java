package cl.todogiftcard.graphql.endpoints;

import com.coxautodev.graphql.tools.SchemaParser;

import cl.todogiftcard.graphql.pojo.GiftCardRepository;
import cl.todogiftcard.graphql.pojo.Query;

import javax.servlet.annotation.WebServlet;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns= "/giftcards")
public class GiftCardsEndpoint extends SimpleGraphQLServlet {

	private static final long serialVersionUID = 1L;

	public GiftCardsEndpoint() {
		super(build());
	}
	
	private static GraphQLSchema build() {
		final GiftCardRepository linkRepo = new GiftCardRepository();
		
		return SchemaParser.newParser()
				.file("schema.graphqls")
				.resolvers(new Query(linkRepo))
				.build()
				.makeExecutableSchema(); 
	}
}
