package w3cschoool_two.java;

import java.util.Comparator;

/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class MaximumTest {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(1,2,7));
    }
}
