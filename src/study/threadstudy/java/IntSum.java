package study.threadstudy.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by yaoxiang.sun on 2018/5/23.
 */
public class IntSum extends RecursiveTask<Long> {
    private int count;

    public IntSum(int count) {
        this.count = count;
    }

    public int getRandomInteger() {
        return 2;
    }

    @Override
    protected Long compute() {
        long result = 0;

        if (this.count <= 0) {
            return 0L;
        }

        if (this.count ==1) {
            return (long) this.getRandomInteger();
        }

        List<RecursiveTask<Long>> forks = new ArrayList<>();
        for (int i = 0; i < this.count; i++) {
            IntSum subTask = new IntSum(1);
            subTask.fork();
            forks.add(subTask);
        }

        for (RecursiveTask<Long> subTask : forks) {
            result = result + subTask.join();
        }
        return result;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        IntSum task = new IntSum(6);
        long sum = pool.invoke(task);
        System.out.println("Sun is " + sum);
    }
}
