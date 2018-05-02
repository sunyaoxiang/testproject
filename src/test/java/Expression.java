package test.java;

/**
 * Created by yaoxiang.sun on 2018/1/24.
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
