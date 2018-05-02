package study.decoratemodel.java;

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
