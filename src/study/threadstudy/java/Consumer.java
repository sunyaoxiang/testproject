package study.threadstudy.java;


/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int data;
        while (true) {
            data = buffer.consume();
        }
    }
}
