package cl.todogiftcard.dto;

import java.util.Calendar;

public class Token {
	
 	private Long idSession;
 	private Long idUsuario;
    private String token;
    private Calendar inicioSesion;
    private Calendar expiracionSesion;
    
	public Long getIdSession() {
		return idSession;
	}
	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Calendar getInicioSesion() {
		return inicioSesion;
	}
	public void setInicioSesion(Calendar inicioSesion) {
		this.inicioSesion = inicioSesion;
	}
	public Calendar getExpiracionSesion() {
		return expiracionSesion;
	}
	public void setExpiracionSesion(Calendar expiracionSesion) {
		this.expiracionSesion = expiracionSesion;
	}
}
