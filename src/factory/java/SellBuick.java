package factory.java;

public class SellBuick implements VendorSell {
    @Override
    public void sell() {
        System.out.println("Buick selling!");
    }
}
