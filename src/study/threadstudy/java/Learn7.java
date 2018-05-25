package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/21.
 */
public class Learn7 extends Thread {
    private boolean keepRunning = true;
    private boolean wait = false;
    private Object syncObject = null;

    public Learn7(Object syncObject) {
        this.syncObject = syncObject;
    }

    public void run() {
        while (keepRunning) {
            synchronized (syncObject) {
                if (wait) {
                    try {
                        syncObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void setKeepRunning(boolean keepRunning) {
        this.keepRunning = keepRunning;
    }

    public void setWait(boolean wait) {
        this.wait = wait;
    }


    public static void main(String[] args) throws InterruptedException{
        Object syncObject = new Object();
        Learn7 ts = new Learn7(syncObject);
        System.out.println("isAlive(): " + ts.isAlive());
        System.out.println("#1: " + ts.getState());
        ts.setPriority(Thread.MAX_PRIORITY);
        System.out.println("#getPriority: " + ts.getPriority());

        ts.start();
        System.out.println("isAlive(): " + ts.isAlive());
        System.out.println("#2: " + ts.getState());
        ts.setWait(true);

        Thread.currentThread().sleep(100);

        synchronized (syncObject) {
            System.out.println("#3: " + ts.getState());
            ts.setWait(false);
            syncObject.notifyAll();
        }

        Thread.currentThread().sleep(2000);
        System.out.println("#4: " + ts.getState());
        ts.setKeepRunning(false);

        Thread.currentThread().sleep(2000);
        System.out.println("#5 " + ts.getState());
        System.out.println("isAlive(): " + ts.isAlive());
    }
}
