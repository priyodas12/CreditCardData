package io.visa.CreditCard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import io.visa.CreditCard.Entity.CardDetails;

@Component
public interface CardRepository extends CrudRepository<CardDetails, Integer> {

}
