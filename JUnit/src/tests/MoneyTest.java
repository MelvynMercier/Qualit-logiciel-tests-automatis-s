/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import classes.Money;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author merci
 */
public class MoneyTest {

    public static void main(String[] args) {
        AmountTest();
    }
    
    @Test
    public static void AmountTest(){
        Money obj = new Money(45,"€");
        assertEquals(45,obj.amount());
    }
}
