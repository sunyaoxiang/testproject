package study.ttd.java;

/**
 * Created by yaoxiang.sun on 2018/1/24.
 */
public class Sum implements Expression {
    Expression augend;
    Expression addend;


    public Money reduce(Bank bank, String to) {
//        int amount = augend.amount + addend.amount;
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }

}
