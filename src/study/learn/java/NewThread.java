package study.learn.java;

public class NewThread extends Thread {
    public NewThread() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread is: " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException inerr) {
            System.out.println(inerr);
        }
        System.out.println("Exitint Child Thread...");

    }
}
