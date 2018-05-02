package study.bridge.java;

public class MakeBusFactory implements MakeFactory {
    @Override
    public void make() {
        System.out.println("Bus Factory make ");
    }
}
