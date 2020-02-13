package io.visa.CreditCard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.visa.CreditCard.DTO.DTOCard;
import io.visa.CreditCard.Entity.CardDetails;
import io.visa.CreditCard.Service.CardService;

@RestController
@RequestMapping("/global/accounts")
public class CardDetailsController {
	
	@Autowired
	private CardService cardService;
	
	@GetMapping("/allinfo")
	public List<CardDetails> getAllInfo(){
		return cardService.getAllCards();
	}
	
	@PostMapping("/card")
	public void addCard(CardDetails cd) {
		cardService.addCard(cd);
	}

}
