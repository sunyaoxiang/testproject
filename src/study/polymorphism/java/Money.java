package study.polymorphism.java;

/**
 * Created by yaoxiang.sun on 2018/7/3.
 */
public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "You have: " + String.valueOf(amount) + " Money.";
    }

    public double getAmount() {
        return amount;
    }

}
