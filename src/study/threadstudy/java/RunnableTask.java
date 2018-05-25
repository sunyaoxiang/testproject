package study.threadstudy.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class RunnableTask implements Runnable {
    private int taskID;
    private int loopCounter;

    public RunnableTask(int taskID, int loopCounter) {
        this.taskID = taskID;
        this.loopCounter = loopCounter;
    }

    public void run() {
        for (int i = 1; i <= loopCounter; i++) {
            try {
                System.out.println("Task #" + this.taskID + " - Iteration #" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        final int THREAD_COUNT = 3;
        final int LOOP_COUNT = 3;
        final int TASK_COUNT = 5;

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 1; i <= TASK_COUNT; i++) {
            RunnableTask task = new RunnableTask(i, LOOP_COUNT);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}