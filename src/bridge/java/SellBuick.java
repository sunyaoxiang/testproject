package bridge.java;

public class SellBuick extends SellMain {
    private String name;
    private int vol;
    private int value;

    public SellBuick(String name, int vol, int value, MakeFactory makeFactory) {
        super(makeFactory);
        this.name = name;
        this.value = value;
        this.vol = vol;

    }

    public void sell() {
        System.out.println("Factory make " + name + ", Vol " + vol + ", Value " + value);
    }
}
