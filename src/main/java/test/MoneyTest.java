package test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import src.Money;


// TODO: Auto-generated Javadoc
/**
 * The Class MoneyTest.
 */
public class MoneyTest {
	
	/** The money. */
	private Money money = new Money(10, "EUR");

	/**
	 * Check positive amount test.
	 */
	@Test
	public void CheckPositiveAmountTest() {
		assertTrue(money.Amount() >= 0);
	}
	
	/**
	 * ISO rule for currency test.
	 */
	@Test
	public void ISORuleForCurrencyTest() {
		assertTrue(money.Currency().length() == 3);
		assertTrue(money.Currency() == "EUR" 
				|| money.Currency() == "USD" 
				|| money.Currency() == "CHF" 
				|| money.Currency() == "GBP");
	}
	
	/**
	 * Addition test.
	 */
	@Test
	public void AdditionTest() {
		Money moneyToAddEur = new Money(20, "EUR");
		assertEquals(money.add(moneyToAddEur).Amount(), 30);
	}
}