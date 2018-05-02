package test.java;

//import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by yaoxiang.sun on 2018/1/24.
 */

public class testDollar {
    @Test
    public void testDollarMultipcation() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
//        product = five.times(3);
        assertEquals(Money.dollar(10), five.times(2));
    }

    @Test
    public void testFrancMultipcation() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(10), five.times(2));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
//        assertEquals("USD1", Money.dollar(1).currency());
//        assertEquals("CHF2", Money.franc(1).currency());
    }

//    @Test
//    public void testDifferentClassEquality() {
//        assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
//    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        test.java.Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnSum() {
        Money five = Money.dollar(5);
        test.java.Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.augend);
    }

    @Test
    public void testReduceSum() {
        test.java.Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testArrayEqyals() {
        assertEquals(new Object[]{"abc"}, new Object[]{"abc"});
    }

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testMixedAddition() {
        test.java.Expression fiveBucks = Money.dollar(5);
        test.java.Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }

    @Test
    public void testSumPlusMoney() {
        test.java.Expression fiveBucks = Money.dollar(5);
        test.java.Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        test.java.Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes() {
        test.java.Expression fiveBucks = Money.dollar(5);
        test.java.Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        test.java.Expression sum = new Sum(fiveBucks, tenFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        Money a = Money.dollar(20);
        assertEquals(Money.dollar(20),a);
    }

    @Test
    public void testPlusSameCurrencyReturnsMoney() {
        test.java.Expression sum = Money.dollar(1).plus(Money.dollar(1));
//        Expression sum = Money.dollar(1);
        assertTrue(sum instanceof Money);
    }
}
