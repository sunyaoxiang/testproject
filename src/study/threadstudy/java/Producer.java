package study.threadstudy.java;


import java.util.Random;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int n = random.nextInt();
            buffer.produce(n);
        }
    }
}
