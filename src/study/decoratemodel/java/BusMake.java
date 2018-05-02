package study.decoratemodel.java;

public class BusMake implements Maker {
    @Override
    public void make() {
        System.out.println("Bus Make!");
    }

    @Override
    public void sell() {
        System.out.println("Bus Sell!");
    }
}
