package study.threadstudy.java;

import java.util.concurrent.CountDownLatch;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class LatchHelperService extends Thread {
    private int ID;
    private CountDownLatch latch;
    public LatchHelperService(int ID, CountDownLatch latch) {
        this.ID = ID;
        this.latch = latch;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Service #" + ID + " has started...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.latch.countDown();
        }
    }
}
