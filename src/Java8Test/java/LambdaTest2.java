package Java8Test.java;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public class LambdaTest2 {
    interface GreetingService {
//        void GreetingService(String message);
        void printMessage(String message, String name) ;
    }


    public static void main(String[] args) {
//        LambdaTest2 lambdaTest2 = new LambdaTest2();
        GreetingService greetingService = (message,name) -> System.out.println(name + " Hello " + message);
        greetingService.printMessage("ni  hao", "yaoxiang");
    }
}
