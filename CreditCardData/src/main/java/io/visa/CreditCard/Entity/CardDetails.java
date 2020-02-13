package io.visa.CreditCard.Entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARDDETAILS")
public class CardDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CARDID")
	private int cardId;
	@Column(name = "PLASTICNO")
	private String cardno;
	@Column(name = "CREDITLIMIT")
	private long creditLimit;
	@Column(name = "CARDHOLDERNAME")
	private String cardHolderName;
	@Column(name = "EXPDATE")
	private Date expDate;

	public CardDetails() {
		super();
	}

	public CardDetails(int cardId, String cardno, long creditLimit, String cardHolderName, Date expDate) {
		super();
		this.cardId = cardId;
		this.cardno = cardno;
		this.creditLimit = creditLimit;
		this.cardHolderName = cardHolderName;
		this.expDate = expDate;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

}
