package study.facademodel.java;

public class FacaedMain {
    interface Facaed {
        void make();
    }

    class CarMake implements Facaed {
        @Override
        public void make() {
            System.out.println("Car making");
        }
    }

    class BusMake implements Facaed {
        @Override
        public void make() {
            System.out.println("Bus making");
        }
    }

    class TaxiMake implements Facaed {
        @Override
        public void make() {
            System.out.println("Taxi making");
        }
    }

    private Facaed carMake = new CarMake();
    private Facaed busMake = new BusMake();
    private Facaed taxiMake = new TaxiMake();

    public FacaedMain() {

    }

    public void doCarMake() {
        carMake.make();
    }

    public void doBusMake() {
        busMake.make();
    }

    public void doTaxiMake() {
        taxiMake.make();
    }

}
