package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/17.
 */
public class Learn1 implements Runnable{
    public String name;

    public Learn1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        print();
    }

    public synchronized static void outmsg() {
        for (Integer i = 1; i <= 500; i++) {
            System.out.println(i.toString() + "  ");
        }
    }

    public void print() {
        synchronized (this) {
            for (Integer i = 1; i <= 500; i++) {
                System.out.println(i.toString() + "  " + name);
            }
        }
    }

    public static void main(String[] args) {
//        Thread t1 = new Thread(new Learn1("T"));
//        Thread t2 = new Thread(new Learn1("F"));
        Thread t1 = new Thread(Learn1::outmsg);
        Thread t2 = new Thread(Learn1::outmsg);

        t1.start();
        t2.start();
    }
}
