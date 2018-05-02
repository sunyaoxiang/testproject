package study.factory.java;

public class MakeBus implements MachineMake {
    @Override
    public void make() {
        System.out.println("Make Bus");
    }
}
