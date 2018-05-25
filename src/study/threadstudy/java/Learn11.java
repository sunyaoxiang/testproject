package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/21.
 */
public class Learn11 extends Thread {
    public volatile boolean keepRunning = true;
    int counter = 1;

    public void run() {
        System.out.println("Start: " + counter);
        while (keepRunning) {
            try {
                System.out.println("Going: " + counter++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End: " + counter);
    }

    public int stopThread() {
        this.keepRunning = false;
        return counter;
    }

    public static void main(String[] args) throws Exception {
        Learn11 v = new Learn11();
        v.start();

        Thread.sleep(2000);
        System.out.println("Maybt to end: " + v.stopThread());

    }
}
