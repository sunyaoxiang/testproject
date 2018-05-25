package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Buffer {
    private int data;
    private boolean empty;

    public Buffer() {
        this.empty = true;
    }

    public synchronized void produce(int newData) {
        while (!this.empty) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.data = newData;
        this.empty = false;
        this.notify();
        System.out.println("Produced: " + newData);
    }

    public  int consume() {
        while (this.empty) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.empty = true;
        this.notify();
        System.out.println("Consumed: " + data);
        return data;
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
