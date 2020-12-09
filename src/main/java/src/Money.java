package src;

// TODO: Auto-generated Javadoc
/**
 * The Class Money.
 */
public class Money {
	
	/** The amount. */
	private int fAmount;
	
	/** The currency. */
	private String fCurrency;
	
	/**
	 * Instantiates a new money.
	 *
	 * @param amount the amount
	 * @param currency the currency
	 */
	public Money(int amount, String currency) {
		this.fAmount = amount;
		this.fCurrency = currency;
	}
	
	/**
	 * Amount.
	 *
	 * @return the int
	 */
	public int Amount() {
		return this.fAmount;
	}
	
	/**
	 * Currency.
	 *
	 * @return the string
	 */
	public String Currency() {
		return this.fCurrency;
	}
	
	/**
	 * Adds the.
	 *
	 * @param m the m
	 * @return the money
	 */
	public Money add(Money m) {
		if(m.fCurrency.equals(this.fCurrency)) {
			this.fAmount += m.fAmount;
		}
		
		return this;
	}
	
	/**
	 * Adds the.
	 *
	 * @param namount the namount
	 * @param ncurrency the ncurrency
	 * @return the money
	 */
	public Money add(int namount, String ncurrency) {
		if(ncurrency.equals(this.fCurrency)) {
			this.fAmount += namount;
		}
		
		return this;
	}
}
