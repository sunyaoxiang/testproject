package decoratemodel.java;

import bridge.java.MakeFactory;

abstract class DecorateMake implements Maker {
    protected Maker maker;

    public DecorateMake(Maker m) {
        this.maker = m;
    }

    @Override
    public void make() {
        maker.make();
    }

}
