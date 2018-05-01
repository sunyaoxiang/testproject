package learn.java;

public class TestThreadDemo {
    public static void main(String[] args) {
        TestThread t = new TestThread();
//        t.run();
        try {
            for (int i = 0; i <5; i++) {
                System.out.println("main Thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException inerr) {
            inerr.printStackTrace();
        }
        System.out.println("Exiting main thread...");
    }
}
