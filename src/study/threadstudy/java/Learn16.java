package study.threadstudy.java;

import java.util.concurrent.Phaser;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Learn16 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser() {
            protected boolean onAdvance(int phase, int parties) {
                System.out.println("Inside onAdvance(): phase = " + phase + ", Regostered Parties = " + parties);
                return false;
            }
        };
        phaser.register();
        System.out.println("#1 : isTerminated():" + phaser.isTerminated());
        phaser.arriveAndDeregister();

        phaser.register();
        phaser.arriveAndDeregister();

        System.out.println("#2 : isTerminated():" + phaser.isTerminated());
        phaser.forceTermination();
        System.out.println("#3 : isTerminated():" + phaser.isTerminated());
    }

}
