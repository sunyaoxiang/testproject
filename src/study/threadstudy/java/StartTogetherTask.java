package study.threadstudy.java;

import java.util.Random;
import java.util.concurrent.Phaser;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class StartTogetherTask extends Thread {
    private Phaser phaser;
    private String taskName;
    private static Random rand = new Random();

    public StartTogetherTask(String taskName, Phaser phaser) {
        this.phaser = phaser;
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + ": Initializing...");
        int sleepTime = rand.nextInt(5) + 3;
        try {
            System.out.println(taskName + ": sleep " + sleepTime + " seconds.");
            Thread.sleep(sleepTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + ": Initilalized...");
        phaser.arriveAndAwaitAdvance();
        System.out.println(taskName + ": Started...");
    }


    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        for (int i = 1; i <= 3; i++) {
            phaser.register();
            String taskName = "Task #" + i;
            StartTogetherTask task = new StartTogetherTask(taskName, phaser);
            task.start();
        }
        phaser.arriveAndDeregister();
    }
}
