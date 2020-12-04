package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Money;
import src.MoneyBag;

public class MoneyBagTest {
	MoneyBag testBag;

	@BeforeEach
	void CreateMoneyBag() {
		Money money1, money2, money3, money4;
		this.testBag = new MoneyBag();

		try {
			money1 = new Money(10, "EUR");
			money2 = new Money(10, "USD");
			money3 = new Money(10, "CHF");
			money4 = new Money(10, "GBP");

			this.testBag.Add(money1);
			this.testBag.Add(money2);
			this.testBag.Add(money3);
			this.testBag.Add(money4);

		} catch (Exception ex) {
			fail(ex.getMessage());
		}
	}
	
    MoneyBag CreateSpecialMoneyBag() {
        Money money1, money2, money3, money4;
        MoneyBag moneyBag = new MoneyBag();

        try {
            money1 = new Money(10, "EUR");
            money2 = new Money(10, "USD");
            money3 = new Money(10, "CHF");
            money4 = new Money(10, "GBP");

            moneyBag.Add(money1);
            moneyBag.Add(money2);
            moneyBag.Add(money3);
            moneyBag.Add(money4);

        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        return moneyBag;
    }
    
    @Test
    void CreateMoneyBagSize() {
        MoneyBag moneybag = new MoneyBag();
        assertEquals(0, moneybag.moneysDictionnary.size());
    }
    
    @Test
    void AddMoney() {
        Money money;
        try {
            money = new Money(10, "EUR");
            this.testBag.Add(money);

        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        assertEquals(20, this.testBag.moneysDictionnary.get("EUR").Amount());
    }
    
    @Test
    void AddMoneyBag() {
        MoneyBag moneyBagToAdd = CreateSpecialMoneyBag();
        try {
            this.testBag.Add(moneyBagToAdd);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        for (Map.Entry<String, Money> entry : this.testBag.moneysDictionnary.entrySet()) {
            assertEquals(20, entry.getValue().Amount());
        }
        assertEquals(4, this.testBag.moneysDictionnary.size());
    }
    
    @Test
    void AddMoneyNoExisting() {
        MoneyBag moneyBag = new MoneyBag();
        try {
            moneyBag.Add(new Money(200, "EUR"));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        assertEquals(200, moneyBag.moneysDictionnary.get("EUR").Amount());
        assertEquals(1, moneyBag.moneysDictionnary.size());
    }
    
    @Test
    void AddMoneyBagNoExisting() {
        MoneyBag moneyBag = new MoneyBag();
        try {
            moneyBag.Add(this.testBag);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        for (Map.Entry<String, Money> entry : moneyBag.moneysDictionnary.entrySet()) {
            assertEquals(10, entry.getValue().Amount());
        }
        assertEquals(4, moneyBag.moneysDictionnary.size());
    }
    
    @Test
    void SubbExistMoney() {
        Money money;
        try {
            money = new Money(5, "EUR");
            this.testBag.Subb(money);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        for (Map.Entry<String, Money> entry : this.testBag.moneysDictionnary.entrySet()) {
            if (entry.getKey() == "EUR") {
                assertEquals(5, entry.getValue().Amount());
            } else {
                assertEquals(10, entry.getValue().Amount());
            }

        }
        assertEquals(4, this.testBag.moneysDictionnary.size());
    }
    
    @Test
    void NormalizeTest() {
        Double normalizeValue = this.testBag.Normalize();
        assertEquals(38.400000000000006, normalizeValue);
    }    
}
