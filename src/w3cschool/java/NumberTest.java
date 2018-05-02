package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/17.
 */
public class NumberTest {
    public static void main(String args[]) {
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);
        System.out.println(num1 == num2);
        Integer num3 = 100;
        Integer num4 = 100;
        int num5 = 100;
        System.out.println(num3 == num4);
        System.out.println(num1 == num5);
        System.out.println(num1.longValue());
        System.out.println(num3.longValue());
        System.out.println(num1.equals(num5));
        System.out.println(num1.compareTo(num1));
        System.out.println(Integer.parseInt("25"));
        System.out.println(num1.toString());

    }
}
