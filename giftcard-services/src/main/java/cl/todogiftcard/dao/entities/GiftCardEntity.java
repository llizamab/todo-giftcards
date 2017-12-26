package cl.todogiftcard.dao.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_GIFTCARD")
public class GiftCardEntity  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_GIFTCARD", unique=true, nullable=false)
	private Long idGiftCard;
	
	@Column(name="NOMBRE_GIFTCARD", nullable=false, length=50)
	private String nombreGiftCard;

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

}
