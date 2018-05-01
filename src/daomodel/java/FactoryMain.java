package daomodel.java;


public class FactoryMain {
    private String factoryname;
    private int value;

    FactoryMain(String factoryname, int value) {
        this.factoryname = factoryname;
        this.value = value;
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
