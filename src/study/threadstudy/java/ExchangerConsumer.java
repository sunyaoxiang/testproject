package study.threadstudy.java;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class ExchangerConsumer extends Thread {
    private Exchanger<ArrayList<Integer>> exchanger;
    private ArrayList<Integer> buffer = new ArrayList<Integer>();

    public ExchangerConsumer(Exchanger<ArrayList<Integer>> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Consumer.");
                buffer = exchanger.exchange(buffer);
                System.out.println("Consumer has received: " + buffer);
                Thread.sleep(1000);
                System.out.println("eating:" + buffer);
                buffer.clear();
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Exchanger<ArrayList<Integer>> exchanger = new Exchanger<>();
        ExchangerProducer producer = new ExchangerProducer(exchanger);
        ExchangerConsumer consumer = new ExchangerConsumer(exchanger);

        producer.start();
        consumer.start();
    }
}
