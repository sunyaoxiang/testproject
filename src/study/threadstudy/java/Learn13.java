package study.threadstudy.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Learn13 {
    private Lock myLock = new ReentrantLock();

    public void updateResource() {
        try {
            // Acquire the lock
            myLock.lock();
        } finally {
            //Release the lock
            myLock.unlock();
        }
    }

}
