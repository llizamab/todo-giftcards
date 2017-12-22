package cl.todogiftcard.graphql.pojo;

public class GiftCard {
	
	 	private final String id;
	    private final String nombre;

	    public GiftCard(String id, String nombre) {
	        this.id = id;
	        this.nombre = nombre;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }
}
