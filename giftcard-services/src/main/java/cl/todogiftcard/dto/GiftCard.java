package cl.todogiftcard.dto;

import java.math.BigDecimal;

public class GiftCard {
	
 	private Long id;
    private String nombre;
    private String titulo;
    private String descripcion;
    private BigDecimal valor;
    private BigDecimal monto;
    private String urlImageSmall;
    private String urlImageMedium;
    private String urlImageLarge;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getUrlImageSmall() {
		return urlImageSmall;
	}
	public void setUrlImageSmall(String urlImageSmall) {
		this.urlImageSmall = urlImageSmall;
	}
	public String getUrlImageMedium() {
		return urlImageMedium;
	}
	public void setUrlImageMedium(String urlImageMedium) {
		this.urlImageMedium = urlImageMedium;
	}
	public String getUrlImageLarge() {
		return urlImageLarge;
	}
	public void setUrlImageLarge(String urlImageLarge) {
		this.urlImageLarge = urlImageLarge;
	}
}
