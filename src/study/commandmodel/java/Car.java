package study.commandmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class Car {
    private int start = 0;
    private int oil = 20;

    public void drive() {
        System.out.print("Start in: " + start + "km, RemainL: " + oil);
        start++;
        oil--;
        System.out.println("|Next in: " + start + "km, RemainL: " + oil);
    }

    public void back() {
        System.out.println("Go Back!");
        this.start = 0;
        this.oil = 20;
    }
}
