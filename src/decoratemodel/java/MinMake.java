package decoratemodel.java;

public class MinMake extends DecorateMake {


    public MinMake(Maker m) {
        super(m);
    }

    @Override
    public void make() {
        System.out.println("Min!");
        maker.make();
    }


    @Override
    public void sell() {
        System.out.println("Sell Min!");
    }
}
