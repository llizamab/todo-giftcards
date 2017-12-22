package cl.todogiftcard.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
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
