package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class CallTrackerMain {
    public static void main(String[] args)  {
        new Thread(CallTrackerMain::run).start();
        new Thread(CallTrackerMain::run).start();
    }

    public static void run() {
        int counter = 5;
        System.out.println(Thread.currentThread().getName() + " generated counter: " + counter);
        for (int i = 0; i < counter; i++) {
            try {
                CallTracker.call();
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
