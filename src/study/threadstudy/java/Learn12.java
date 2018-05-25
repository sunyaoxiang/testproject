package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Learn12 extends Thread {
    public volatile boolean keepRunning = true;
    public boolean suspended = false;

    public synchronized void stopThread() {
        this.keepRunning = false;
        this.notify();
    }

    public synchronized void suspendThread() {
        this.suspended = true;
    }

    public synchronized void resumeThread() {
        this.suspended = false;
        this.notify();
    }

    public void run() {
        System.out.println("Thread started..");
        while (keepRunning) {
            try {
                System.out.println("Going to sleep..");
                Thread.sleep(400);
                synchronized (this) {
                    while (suspended) {
                        System.out.println("Suspended..");
                        this.wait();
                        System.out.println("Resumed..");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Learn12 t = new Learn12();
        t.start();
        Thread.sleep(1000);
        t.suspendThread();
        Thread.sleep(1000);
        t.resumeThread();
        Thread.sleep(1000);
        t.stopThread();
    }
}
