package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/21.
 */
public class Learn9 {
    public static void main(String[] args) {
//        System.out.println("#1: " + Thread.interrupted());
//
//        Thread mainThread = Thread.currentThread();
//        mainThread.interrupt();
////        Thread.currentThread().interrupt();
//        System.out.println("#2: " + mainThread.isInterrupted());
//        System.out.println("#3: " + mainThread.isInterrupted());
//        System.out.println("#4: " + Thread.interrupted());
//        System.out.println("#5: " + Thread.interrupted());
//        System.out.println("#6: " + mainThread.interrupted());

//        Thread t = new Thread(Learn9::run);
//        t.start();
//        try {
//            Thread.currentThread().sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
////        System.exit(1);
//        t.interrupt();

        Thread t = new Thread(Learn9::run);
        t.start();
        try {
            Thread.sleep(5000);
            t.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }

//    public static void run() {
//        int counter = 0;
//        while (!Thread.interrupted()) {
//            counter++;
//        }
//        System.out.println("Counter: " + counter);
//    }

    public static void run() {
        int counter = 1;
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Counter: " + counter);
                counter++;
            } catch (InterruptedException e) {
                System.out.println("Error: " + counter);
            }
        }
    }
}
