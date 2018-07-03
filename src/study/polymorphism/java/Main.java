package study.polymorphism.java;

/**
 * Created by yaoxiang.sun on 2018/7/3.
 */
public class Main {
    public static void main(String[] atgs) {
//        CNY c = new CNY(200.0);
//        Money m = new Money(100.0);
//        ICBC i = new ICBC(100.0, "ICBC");
//
//        System.out.println(c.toString());
//        System.out.println(m.toString());
//        System.out.println(i.toString());

        Money m = new ICBC(100.01, "ICBC");
        Money c = new ICBC(200.01, "ICBC");
        Money i = new ICBC(300.03, "ICBC");

        System.out.println(m.toString());
        System.out.println(c.toString());
        System.out.println(i.toString());
    }
}
