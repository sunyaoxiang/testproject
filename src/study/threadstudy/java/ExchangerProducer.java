package study.threadstudy.java;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class ExchangerProducer extends Thread {
    private Exchanger<ArrayList<Integer>> exchanger;
    private ArrayList<Integer> buffer = new ArrayList<Integer>();

    public ExchangerProducer(Exchanger<ArrayList<Integer>> exchanger) {
        this.exchanger = exchanger;
    }

    public void fillBuffer() {
        for (int i = 0; i <= 3; i++) {
            buffer.add(i);
        }
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Producer.");
                Thread.sleep(1000);
                fillBuffer();
                System.out.println("Producer has produced and waiting: " + buffer);
                buffer = exchanger.exchange(buffer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
