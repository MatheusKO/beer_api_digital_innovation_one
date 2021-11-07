package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockBelowZeroException extends Exception{
    public BeerStockBelowZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed can't go below zero: %s", id, quantityToDecrement));
    }
}
