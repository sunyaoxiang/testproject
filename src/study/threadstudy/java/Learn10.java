package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/21.
 */
public class Learn10 {
    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = Thread.currentThread();
//        ThreadGroup tg1 = t1.getThreadGroup();
//        System.out.println(t1.getName());
//        System.out.println(tg1.getName());
//
//        Thread t2 = new Thread("new Thread");
//        ThreadGroup tg2 = t2.getThreadGroup();
//        System.out.println(t2.getName());
//        System.out.println(tg2.getName());

        ThreadGroup tg3 = new ThreadGroup("3new Thread group");

        Thread t31 = new Thread(tg3, "31new Thread");
//        t31.setDaemon(true);
        t31.start();
        System.out.println(t31.isAlive());

        Thread t32 = new Thread(tg3, "32new Thread");
        t32.start();
        Thread t33 = new Thread(tg3, "33new Thread");
        t33.start();

//        ThreadGroup tg3f = tg3.getParent();
//        System.out.println(tg3f.getName());
        System.out.println(tg3.activeCount());
        Thread[] threads = new Thread[tg3.activeCount()];
        tg3.enumerate(threads);
//        Thread.currentThread().join();
        System.out.println(threads.length);
//        Thread.currentThread().sleep(1000);
        for (Thread each:threads) {
            System.out.println(each.getName());
//            each.start();
        }

//        Thread.currentThread().sleep(1000);
        System.out.println(t31.isAlive());


//        System.out.println(tg3.activeCount());
//        System.out.println(t31.getName());
//        System.out.println(tg3.getName());

    }
}
