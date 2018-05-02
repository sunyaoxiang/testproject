package study.cloneable.java;

public class FactoryCar extends MainFactory {
    @Override
    public void make() {
        System.out.println("Inside Car::make() method.");
    }

    public FactoryCar() {
        type = "Car";
    }
}
