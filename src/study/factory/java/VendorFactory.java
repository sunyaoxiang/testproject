package study.factory.java;

public class VendorFactory extends AbstractFactory{
    @Override
    MachineMake getMake(String name) {
        return null;
    }

    public VendorSell getVendor(String vendor) {
        if (vendor == null) {
            return null;
        }
        switch (vendor) {
            case "Buick":
                return new SellBuick();
            case "Fox":
                return new SellFox();
            case "Polo":
                return new SellPolo();
            default:
                return null;
        }
    }
}
