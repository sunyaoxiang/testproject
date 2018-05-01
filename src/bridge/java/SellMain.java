package bridge.java;

abstract class SellMain {
    protected MakeFactory makeFactory;
    protected SellMain(MakeFactory makeFactory) {
        this.makeFactory = makeFactory;
    }
    public abstract void sell();
}
