package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/21.
 */
public class Learn8 {
    public static void print() {
        int counter = 1;
        while (true) {
            try {
                System.out.println("Counter: " + counter);
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(Learn8::print);
        t.setDaemon(true);
        t.start();

//        try {
//            t.join();
//        } catch (InterruptedException ie) {
//            ie.printStackTrace();
//        }

        System.out.println("Thread outing.");

        Thread t2 = new Thread(Learn8::print);
        t2.setDaemon(true);
        t2.start();
        System.out.println("Thread outing.");
    }
}
