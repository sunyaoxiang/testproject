package study.threadstudy.java;

import java.util.concurrent.TimeUnit;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Learn5 {
    public static void main(String[] args) {
        try {
            System.out.println("wait 5s.");
//            Thread.sleep(5000);
            TimeUnit.SECONDS.sleep(5);
            System.out.println("wakeup.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
