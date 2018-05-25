package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Learn3 extends Thread {
    public Learn3(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String threadName = t.getName();
        System.out.println("Run method: " + threadName);
    }

    public static void main(String[] args) {
        Learn3 t1 = new Learn3("One");
        Learn3 t2 = new Learn3("Two");

        t1.start();
        t2.start();

        Thread tn = Thread.currentThread();
        String tnName = tn.getName();
        System.out.println("Main method: " + tnName);

    }
}
