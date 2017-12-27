package cl.todogiftcard.dao.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TBL_EMPRESA")
public class EmpresaEntity  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_EMPRESA", unique=true, nullable=false)
	private Long idEmpresa;
	
	@Column(name="NOMBRE_EMPRESA", nullable=false, length=50)
	private String nombreEmpresa;
	
	@Column(name="DESCRIPCION", nullable=true, length=500)
	private String descripcion;

	@Column(name="EMAIL", nullable=true, length=250)
	private String email;

	@Column(name="RUT", nullable=true, length=20)
	private String rut;
	
	@Column(name="CELULAR", nullable=true, length=20)
	private String celular;
	
	@Column(name="TELEFONO", nullable=true, length=20)
	private String telefono;
	
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
	
	@OneToMany(mappedBy="empresa", fetch=FetchType.LAZY)
	private Set<GiftCardEntity> giftcards;

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public Set<GiftCardEntity> getGiftcards() {
		return giftcards;
	}

	public void setGiftcards(Set<GiftCardEntity> giftcards) {
		this.giftcards = giftcards;
	}
}
