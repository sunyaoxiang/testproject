package study.cloneable.java;

public class FactoryTaxi extends MainFactory {
    @Override
    public void make() {
        System.out.println("Inside Taxi::make() method.");
    }

    public FactoryTaxi() {
        type = "Taxi";
    }
}
