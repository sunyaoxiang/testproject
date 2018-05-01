package factory.java;

public class SellPolo implements VendorSell {
    @Override
    public void sell() {
        System.out.println("Polo Hot Selling");
    }
}
