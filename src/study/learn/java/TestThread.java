package study.learn.java;

public class TestThread implements Runnable{
    Thread t;

    public TestThread() {
        t = new Thread(this, "Deamo Thread");
        System.out.println("Deamo Thread Name: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child Thread is: " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException inerr) {
            inerr.printStackTrace();
        }
        System.out.println("Exiting child thread...");
    }
}
