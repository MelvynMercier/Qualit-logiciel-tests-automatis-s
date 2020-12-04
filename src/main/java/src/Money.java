package src;

public class Money {
	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		this.fAmount = amount;
		this.fCurrency = currency;
	}
	
	public int Amount() {
		return this.fAmount;
	}
	
	public String Currency() {
		return this.fCurrency;
	}
	
	public Money add(Money m) {
		if(m.fCurrency.equals(this.fCurrency)) {
			this.fAmount += m.fAmount;
		}
		
		return this;
	}
	
	public Money add(int namount, String ncurrency) {
		if(ncurrency.equals(this.fCurrency)) {
			this.fAmount += namount;
		}
		
		return this;
	}
}
