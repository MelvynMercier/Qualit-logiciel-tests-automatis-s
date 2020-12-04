package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import src.Money;


public class MoneyTest {
	
	private Money money = new Money(10, "EUR");

	@Test
	public void CheckPositiveAmountTest() {
		assertTrue(money.Amount() >= 0);
	}
	
	@Test
	public void ISORuleForCurrencyTest() {
		assertTrue(money.Currency().length() == 3);
		assertTrue(money.Currency() == "EUR" 
				|| money.Currency() == "USD" 
				|| money.Currency() == "CHF" 
				|| money.Currency() == "GBP");
	}
	
	@Test
	public void AdditionTest() {
		Money moneyToAddEur = new Money(20, "EUR");
		
		assertEquals(money.add(moneyToAddEur).Amount(), 30);
	}
}