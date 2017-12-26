package cl.todogiftcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EntityScan("cl.todogiftcard.dao.entities")
public class GiftCardsApplication {

	/** Constructor.
	 */
	public GiftCardsApplication() {
		super();
	}

	/** The main method.
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(GiftCardsApplication.class, args);
    }  
}
