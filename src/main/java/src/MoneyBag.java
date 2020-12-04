package src;

import java.util.HashMap;
import java.util.Map;

public class MoneyBag {
	public HashMap<String, Money> moneysDictionnary;
	
    public MoneyBag() {
        this.moneysDictionnary = new HashMap<String, Money>();
    }
    
    public HashMap<String, Money> moneys() {
        return this.moneysDictionnary;
    }
    
    public Double Normalize() {
        Double total = 0.00;
        for (Map.Entry<String, Money> entry : this.moneysDictionnary.entrySet()) {
            switch (entry.getKey()) {
                case "EUR":
                    total += entry.getValue().Amount();
                    break;
                case "USD":
                    total += (entry.getValue().Amount() * 0.82);
                    break;
                case "CHF":
                    total += (entry.getValue().Amount() * 0.92);
                    break;
                case "GBP":
                    total += (entry.getValue().Amount() * 1.10);
                    break;
            
                default:
                    break;
            }
        }
        return total;
    }
    
    public Boolean NormalizeEqual(MoneyBag moneyBag) {
        return (this.Normalize().equals(moneyBag.Normalize()));
    }
    
    public MoneyBag Add(Money money) {
        if (this.moneysDictionnary.containsKey(money.Currency())) {
            this.moneysDictionnary.get(money.Currency()).add(money);
        } else {
            this.moneysDictionnary.put(money.Currency(), new Money(money.Amount(), money.Currency()));
        }
        return this;
    }
    
    public MoneyBag Subb(Money money) throws Exception{
        if (this.moneysDictionnary.containsKey(money.Currency())){
            this.moneysDictionnary.get(money.Currency()).add(-money.Amount(), money.Currency());
        } else {
            throw new Exception();
        }

        return this;
    }
    
    public MoneyBag Add(MoneyBag moneyBag) {
        for (Map.Entry<String, Money> entry : moneyBag.moneysDictionnary.entrySet()) {
            this.Add(entry.getValue());
        }
        return this;
    }
    
    public MoneyBag Subb(MoneyBag moneyBag) throws Exception{
        for (Map.Entry<String, Money> entry : moneyBag.moneysDictionnary.entrySet()) {
            this.Subb(entry.getValue());
        }
        return this;
    }
}
