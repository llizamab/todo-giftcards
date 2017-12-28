package cl.todogiftcard.dao.entities;

import java.io.Serializable;
import java.util.Calendar;

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
@Table(name="BIT_LOGIN")
public class BitacoraLoginEntity  implements Serializable {

	private static final long serialVersionUID = 5L;
	
	@Id
	@Column(name="ID_SESSION", unique=true, nullable=false)
	private Long idSession;
	
	@Column(name="TOKEN", nullable=false, length=50)
	private String token;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INICIO_SESION", nullable=true)
	private Calendar inicioSession;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXPIRACION_SESION", nullable=true)
	private Calendar expiracionSession;
	
	@Column(name="ACTIVO", nullable=true)
	private boolean activo;

	@ManyToOne(fetch=FetchType.LAZY)
	@NotNull
	@JoinColumn(name = "ID_USUARIO")
	private UserEntity user;

	public Long getIdSession() {
		return idSession;
	}

	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Calendar getInicioSession() {
		return inicioSession;
	}

	public void setInicioSession(Calendar inicioSession) {
		this.inicioSession = inicioSession;
	}

	public Calendar getExpiracionSession() {
		return expiracionSession;
	}

	public void setExpiracionSession(Calendar expiracionSession) {
		this.expiracionSession = expiracionSession;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
