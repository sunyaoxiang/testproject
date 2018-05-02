package test.java;

/**
 * Created by yaoxiang.sun on 2018/1/24.
 */

//abstract class Money {
class Money implements Expression {
    protected int amount;
    protected String currency;

    String currency() {
        return currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && currency().equals(money.currency());
    }


    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }

//    Money plus(Money addend) {
//        return new Money(amount + addend.amount, currency);
//    }

    public Expression plus(Expression addend) {
//        return new Money(amount + addend.amount, currency);
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
//        return this;
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }


}
