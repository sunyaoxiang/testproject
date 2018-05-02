package study.factory.java;

abstract class AbstractFactory {
    abstract MachineMake getMake(String name);
    abstract VendorSell getVendor(String sell);
}
