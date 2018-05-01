package factory.java;

public class SellFox implements VendorSell {
    @Override
    public void sell() {
        System.out.println("Fox Selling?");
    }
}
