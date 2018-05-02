package study.learn.java;

public class NewThreadTest {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread is " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException inerr) {
            inerr.printStackTrace();
        }
        System.out.println("Exiting Main Thread...");
    }


    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread is: " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException inerr) {
            System.out.println(inerr);
        }
        System.out.println("Exitint Child Thread...");

    }
}
