package study.threadstudy.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Learn14 {
    private int value;
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private Lock rLock = rwLock.readLock();
    private Lock wLock = rwLock.writeLock();

    public Learn14(int value) {
        this.value = value;
    }

    public int getValue() {
        rLock.lock();
        try {
            return this.value;
        } finally {
            rLock.unlock();
        }
    }

    public void setValue(int value) {
        wLock.lock();
        try {
            this.value = value;
        } finally {
            wLock.unlock();
        }
    }
}
