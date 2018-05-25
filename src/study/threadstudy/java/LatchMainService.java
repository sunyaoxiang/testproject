package study.threadstudy.java;

import java.util.concurrent.CountDownLatch;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class LatchMainService extends Thread {
    private CountDownLatch latch;

    public LatchMainService(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println("Waiting for services to start.");
            latch.await();
            System.out.println("Started.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        LatchMainService ms = new LatchMainService(latch);

        ms.start();

        for (int i = 1; i <= 6; i++) {
            LatchHelperService lhs = new LatchHelperService(i, latch);
            lhs.start();
            Thread.sleep(1000);
        }
    }
}
