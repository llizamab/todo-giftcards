package cl.todogiftcard.dao.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TBL_GIFTCARD")
public class GiftCardEntity  implements Serializable {

	private static final long serialVersionUID = 3L;
	
	@Id
	@Column(name="ID_GIFTCARD", unique=true, nullable=false)
	private Long idGiftCard;
	
	@Column(name="NOMBRE_GIFTCARD", nullable=false, length=50)
	private String nombreGiftCard;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@NotNull
	@JoinColumn(name = "ID_EMPRESA")
	private EmpresaEntity empresa;
	
	@Column(name="TITULO", nullable=false, length=100)
	private String titulo;
	
	@Column(name="DESCRIPCION", nullable=false, length=2000)
	private String descripcion;
	
	@Column(name="VALOR", nullable=false)
	private BigDecimal valor;
	
	@Column(name="MONTO", nullable=false)
	private BigDecimal monto;
	
	@Column(name="URL_IMAGE_SMALL", nullable=true, length=2000)
	private String urlImageSmall;
	
	@Column(name="URL_IMAGE_MEDIUM", nullable=true, length=2000)
	private String urlImageMedium;
	
	@Column(name="URL_IMAGE_LARGE", nullable=true, length=2000)
	private String urlImageLarge;
	
	@Column(name="ACTIVO", nullable=true)
	private boolean activo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ALTA", nullable=true)
	private Date fechaAlta;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TIMESTAMP_ALTA", nullable=true)
	private Calendar timestampAlta;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_MODIFICACION", nullable=true)
	private Date fechaModificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TIMESTAMP_MODIFICACION", nullable=true)
	private Calendar timestampModificacion;

	public Long getIdGiftCard() {
		return idGiftCard;
	}

	public void setIdGiftCard(Long idGiftCard) {
		this.idGiftCard = idGiftCard;
	}

	public String getNombreGiftCard() {
		return nombreGiftCard;
	}

	public void setNombreGiftCard(String nombreGiftCard) {
		this.nombreGiftCard = nombreGiftCard;
	}

	public EmpresaEntity getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaEntity empresa) {
		this.empresa = empresa;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Calendar getTimestampAlta() {
		return timestampAlta;
	}

	public void setTimestampAlta(Calendar timestampAlta) {
		this.timestampAlta = timestampAlta;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Calendar getTimestampModificacion() {
		return timestampModificacion;
	}

	public void setTimestampModificacion(Calendar timestampModificacion) {
		this.timestampModificacion = timestampModificacion;
	}
}
