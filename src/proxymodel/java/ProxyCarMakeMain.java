package proxymodel.java;

public class ProxyCarMakeMain {
    public static void main(String[] args) {
        Make make = new ProxyCarMake("Gey");
        make.productMake();
    }
}
