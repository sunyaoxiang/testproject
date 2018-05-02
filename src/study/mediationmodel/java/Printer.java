package study.mediationmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class Printer {
    public static void showMessage(Machine machine, String message) {
        System.out.println(new java.util.Date().toString()
        + ", Name: " + machine.getName() + ", message: " + message);
    }
}
