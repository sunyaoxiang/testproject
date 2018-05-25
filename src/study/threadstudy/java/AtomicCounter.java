package study.threadstudy.java;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class AtomicCounter {
    private AtomicLong value = new AtomicLong(0L);

    public long next() {
        return value.incrementAndGet();
    }
}
