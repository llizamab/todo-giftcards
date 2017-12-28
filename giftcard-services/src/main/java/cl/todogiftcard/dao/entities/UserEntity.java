package cl.todogiftcard.dao.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TBL_USUARIO")
public class UserEntity  implements Serializable {

	private static final long serialVersionUID = 4L;
	
	@Id
	@Column(name="ID_USUARIO", unique=true, nullable=false)
	private Long idUsuario;
	
	@Column(name="USER_NAME", nullable=false, length=50)
	private String userName;

	@Column(name="EMAIL", nullable=false, length=250)
	private String email;
	
	@Column(name="PASSWORD", nullable=false, length=500)
	private String password;
	
	@Column(name="RUT", nullable=true, length=20)
	private String rut;
	
	@Column(name="NOMBRES", nullable=true, length=500)
	private String nombres;
	
	@Column(name="APELLIDOS", nullable=true, length=500)
	private String apellidos;
	
	@Column(name="CELULAR", nullable=true, length=20)
	private String celular;
	
	@Column(name="TELEFONO", nullable=true, length=20)
	private String telefono;
	
	@Column(name="EMAIL_VALIDO", nullable=true)
	private boolean emailValido;
	
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public boolean isEmailValido() {
		return emailValido;
	}

	public void setEmailValido(boolean emailValido) {
		this.emailValido = emailValido;
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
