package study.proxymodel.java;

public class ProxyCarMake implements Make {
    private CarMake carMake;
    private String name;

    public ProxyCarMake(String name) {
//        System.out.println("Making ProxyCarMake " + name);
        this.name =name;
    }

    @Override
    public void productMake() {
        if (carMake == null) {
            carMake = new CarMake(name);
        }
        carMake.productMake();
    }
}
