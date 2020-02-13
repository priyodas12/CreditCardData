package io.visa.CreditCard.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.visa.CreditCard.DTO.DTOCard;
import io.visa.CreditCard.Entity.CardDetails;
import io.visa.CreditCard.Repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;
	@Autowired
	private DTOCard carddto;
	
	ModelMapper mdlMapper=new ModelMapper();
	
	public List<CardDetails> getAllCards(){
		List<CardDetails> cards=new ArrayList<>();
		//al.forEach(arg0);
		 cardRepository.findAll().forEach(card->cards.add((CardDetails) card));
		 return cards;
	}
	
	public void addCard(CardDetails cd) {
		cardRepository.save(cd);
	}
	
	

}
