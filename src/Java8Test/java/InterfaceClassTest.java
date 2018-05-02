package Java8Test.java;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public class InterfaceClassTest implements carone,cartwo {
    public void print() {
        carone.super.print();
        cartwo.super.print();
    }
    public void fun(){

    }

    public void printPublic() {
        this.print();
        printStatic(" for name ");
    }

    public static void main(String[] args) {
        InterfaceClassTest interfaceClassTest = new InterfaceClassTest();
        interfaceClassTest.printPublic();
        interfaceClassTest.print();
    }
}