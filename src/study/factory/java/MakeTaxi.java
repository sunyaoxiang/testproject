package study.factory.java;

public class MakeTaxi implements MachineMake {

    @Override
    public void make() {
        System.out.println("Make Taxi");
    }
}
