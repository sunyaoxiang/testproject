package study.factory.java;

public class MakeCar implements MachineMake{

    @Override
    public void make() {
        System.out.println("Make Car");
    }
}
