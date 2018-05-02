package study.factory.java;

public class MachineFactory extends AbstractFactory {
    public MachineMake getMake(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "Car":
                return new MakeCar();
            case "Bus":
                return new MakeBus();
            case "Taxi":
                return new MakeTaxi();
            default:
                return null;
        }
    }
    @Override
    VendorSell getVendor(String sell) {
        return null;
    }


    public static void main(String[] args) {
        MachineFactory machineFactory = new MachineFactory();

        MachineMake makeOne = machineFactory.getMake("Car");
        makeOne.make();

        MachineMake makeTwo = machineFactory.getMake("Bus");
        makeTwo.make();

        MachineMake makeThree = machineFactory.getMake("Taxi");
        makeThree.make();
    }
}
