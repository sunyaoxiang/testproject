package study.Java8New.java;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    interface MathOperation {
        int operation(int a, int b);
    }

    private int operation(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface StrOperation {
        String operation(String a, String b);
    }

    private String stroperation(String a, String b, StrOperation strOperation) {
        return strOperation.operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface GreetingClent {
        void getMessage(String message, String address, Integer num);
    }


    //    final static String name = "yaoxiang";
    static String name = "yaoxiang";

    public static void main(String[] args) {


        LambdaTest tester = new LambdaTest();
//        () -> LambdaTest()
        MathOperation addition = (int a, int b) -> a + b;

        System.out.println(tester.operation(10, 5, addition));

        StrOperation subtraction = (String a, String b) -> a + b;

        System.out.println(tester.stroperation("hello 10 ", "yaoxiang", subtraction));

        GreetingService gres1 = (message) -> System.out.println("for lambda " + message);

        gres1.sayMessage("hello");

        GreetingClent grec1 = (message, address, number) -> {
            tester.name = "change";
            List list = new ArrayList();
            list.add(message);
            list.add(address);
            list.add(number);
            System.out.println("message:" + message + name);
            System.out.println("address:" + address);
            System.out.println("number:" + number);
            list.forEach(System.out::println);
//            number.toString(System.out::println);
        };

        grec1.getMessage("hello", "nanjing", 1231);

    }
}
