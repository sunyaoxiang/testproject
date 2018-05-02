package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
abstract class Caravan {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void changeColor();
}


class CaravanSon extends Caravan {
    public void goFast() {}
    public void changeColor() {}
}