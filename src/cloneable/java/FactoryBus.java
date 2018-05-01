package cloneable.java;

public class FactoryBus extends MainFactory {
    @Override
    public void make() {
        System.out.println("Inside Bus::make() method.");
    }

    public FactoryBus() {
        type = "Bus";
    }
}
