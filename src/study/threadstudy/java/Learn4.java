package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Learn4 implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Catch exception from: " + t.getName());
    }

    public static void main(String[] args) {
        Learn4 handler = new Learn4();

        Thread.currentThread().setUncaughtExceptionHandler(handler);

        throw new RuntimeException();
    }
}