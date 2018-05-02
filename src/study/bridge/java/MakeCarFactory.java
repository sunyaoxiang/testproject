package study.bridge.java;

public class MakeCarFactory implements MakeFactory {
    @Override
    public void make() {
        System.out.println("Car Factory make ");
    }
}
