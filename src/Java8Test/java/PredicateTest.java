package Java8Test.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public class PredicateTest {
    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 100, 23, 54, 123, 221);
        eval(list, n -> n % 2 == 0);
        eval(list, n -> n > 100);
        eval(list, n -> n < 100);
    }
}
