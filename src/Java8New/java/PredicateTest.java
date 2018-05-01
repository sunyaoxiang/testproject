package Java8New.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class PredicateTest {
    public static void eval(List<Integer> list, IntPredicate intPredicate) {
        for (Integer n : list) {

            if (intPredicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,3,4);
        eval(mylist, n->true);
    }
}
