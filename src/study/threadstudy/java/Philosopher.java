package study.threadstudy.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Philosopher  extends Thread {
    private Lock leftFork;
    private Lock rightFork;
    private String name;
    private static int num = 0;

    public Philosopher(Lock leftFork, Lock rightFork, String name) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
        num++;
    }

    public void think() {
        System.out.println(name + " is thinking..." + num);
    }

    public void eat() {
        if (leftFork.tryLock()) {
            try {
                if (rightFork.tryLock()) {
                    try {
                        System.out.println(name + " is eating..." + num);
                    } finally {
                        rightFork.unlock();
                    }
                }
            } finally {
                leftFork.unlock();
            }
        }
    }
    public void run() {
        while (true) {
            think();
            eat();
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lock leftLock = new ReentrantLock();
        Lock rightLock = new ReentrantLock();

//        Philosopher philosopher = new Philosopher(leftLock, rightLock, "Jack");

        Thread t = new Thread(new Philosopher(leftLock, rightLock, "Jack"));
        t.run();

        Thread t2 = new Thread(new Philosopher(leftLock, rightLock, "Jack"));
        t2.run();
    }
}
