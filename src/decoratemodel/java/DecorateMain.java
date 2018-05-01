package decoratemodel.java;

public class DecorateMain {
    public static void main(String[] args) {
        Maker maker = new CarMake();
        Maker decorateMakerCarMax = new MaxMake(maker);
        Maker decorateMakerBusMax = new MaxMake(new BusMake());

        Maker decorateMakerBusMin = new MinMake(new BusMake());

        maker.make();
        decorateMakerCarMax.make();
        decorateMakerBusMax.make();

        decorateMakerBusMin.make();

        decorateMakerBusMin.sell();
        decorateMakerBusMax.sell();

    }
}
