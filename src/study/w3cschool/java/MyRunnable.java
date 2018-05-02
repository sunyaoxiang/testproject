package study.w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class MyRunnable implements Runnable {
    private volatile boolean active;
    public void run() {
        active = true;
        while (active)
        {

        }
    }

    public void stop() {
        active = false;
    }
}
