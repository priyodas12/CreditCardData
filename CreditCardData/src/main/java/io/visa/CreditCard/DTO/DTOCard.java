package io.visa.CreditCard.DTO;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class DTOCard {
	
	
	private String cardno;
	private long creditLimit;
	private String cardHolderName;
	private Date expDate;
	
	
	public DTOCard() {
		super();
	}

	public DTOCard(String cardno, long creditLimit, String cardHolderName, Date expDate) {
		super();
		this.cardno = cardno;
		this.creditLimit = creditLimit;
		this.cardHolderName = cardHolderName;
		this.expDate = expDate;
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
