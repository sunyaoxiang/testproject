package bridge.java;

public class BridgeMain {
    public static void main(String[] args) {
        SellMain sellBuick = new SellBuick("Car", 100, 20 , new MakeCarFactory());
        SellMain sellBuick2 = new SellBuick("Bus", 100, 20 , new MakeBusFactory());

        sellBuick.sell();
        sellBuick2.sell();
        sellBuick.makeFactory.make();
        sellBuick2.makeFactory.make();
    }
}
