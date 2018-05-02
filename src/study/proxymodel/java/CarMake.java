package study.proxymodel.java;

public class CarMake implements Make {
    private String name;

    public CarMake(String name) {
        this.name = name;
    }

    @Override
    public void productMake() {
        System.out.println("productMaking " + name);
    }
}
