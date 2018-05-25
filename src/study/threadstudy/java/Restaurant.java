package study.threadstudy.java;

import java.util.concurrent.Semaphore;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Restaurant {
    private Semaphore tables;

    public Restaurant(int tablesCount) {
        this.tables = new Semaphore(tablesCount);
    }

    public void getTable(int customerID) {
        try {
            System.out.println("Customer #" + customerID + " is trying to get a table.");
            tables.acquire();
            System.out.println("Customer #" + customerID + " get a table.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void returnTable(int customerID) {
        System.out.println("Customer #" + customerID + " return a table.");
        tables.release();
    }
}
