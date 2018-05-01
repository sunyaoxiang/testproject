package factory.java;

public class FactoryMain {
    public static AbstractFactory getFactory(String factory) {

        if (factory.equalsIgnoreCase("M")) {
            return new MachineFactory();
        }

        if (factory.equalsIgnoreCase("V")) {
            return new VendorFactory();
        }

        return null;

    }

    public static void main(String[] args) {
        AbstractFactory abstractFactoryMake = FactoryMain.getFactory("M");
        MachineMake machineMake = abstractFactoryMake.getMake("Car");
        machineMake.make();

        AbstractFactory abstractFactoryVendor = FactoryMain.getFactory("V");
        VendorSell vendorMake = abstractFactoryVendor.getVendor("Buick");
        if (vendorMake != null) {
            vendorMake.sell();
        }
        VendorSell vendorMake_other = abstractFactoryVendor.getVendor("Other");
        if (vendorMake_other != null) {
            vendorMake_other.sell();
        }
        if (vendorMake_other == null) {
            System.out.println("vendorMake is null");
        }
    }

}
