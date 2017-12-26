package cl.todogiftcard.dto;

public class GiftCard {
	
	 	private final Long id;
	    private final String nombre;

	    public GiftCard(Long id, String nombre) {
	        this.id = id;
	        this.nombre = nombre;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }
}
