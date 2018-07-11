package study.polymorphism.java;

/**
 * Created by yaoxiang.sun on 2018/7/3.
 */
public class CNY extends Money {
    private String currency;

    public CNY(double amount) {
        super(amount);
        setCurrency();
    }

    public String toString() {
        return "You have: " + currency + "|" +String.valueOf(getAmount()) + " Money.";
    }

    public void setCurrency() {
        this.currency = "CNY";
    }

    public String getCurrency() {
        return currency;
    }
}
