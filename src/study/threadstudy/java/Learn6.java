package study.threadstudy.java;

import java.util.concurrent.TimeUnit;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Learn6 extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(i);
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Learn6() {

    }

    public static void main(String[] args) {
        Learn6 learn6 = new Learn6();
        Thread t1 = new Thread(learn6);
//        Thread t1 = new Thread(Learn6::print);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
