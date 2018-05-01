package decoratemodel.java;

public class MaxMake extends DecorateMake {


    public MaxMake(Maker m) {
        super(m);
    }

    @Override
    public void make() {
        System.out.println("Max!");
        maker.make();
    }

    @Override
    public void sell() {
        System.out.println("Sell Max!");
    }

}
