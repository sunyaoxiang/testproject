package test.java;
import java.util.Hashtable;

/**
 * Created by yaoxiang.sun on 2018/1/24.
 */
public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    private Hashtable rates = new Hashtable();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
