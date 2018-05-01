package decoratemodel.java;

public class CarMake implements Maker {
    @Override
    public void make() {
        System.out.println("Car Make!");
    }

    @Override
    public void sell() {
        System.out.println("Car Sell!");
    }
}
