/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author merci
 */
public class Money {

    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        this.fAmount = amount;
        this.fCurrency = currency;
    }

    public int amount() {
        return this.fAmount;
    }

    public String currency() {
        return this.fCurrency;
    }

    public Money add(Money m) {
        return null;
    }

    public Money add(int namount, String ncurrency) {
        return null;
    }
}
