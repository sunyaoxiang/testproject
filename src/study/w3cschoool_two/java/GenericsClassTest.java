package study.w3cschoool_two.java;


/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class GenericsClassTest<X> {
    private X x;

    public void add(X x) {
        this.x = x;
    }

    public X get() {
        return x;
    }

    public static void main(String[] args) {
        GenericsClassTest intBox = new GenericsClassTest();
        GenericsClassTest strBox = new GenericsClassTest();

        intBox.add(5);
        strBox.add("Yaoxiang.Sun");

        System.out.println(intBox.get());
        System.out.println(strBox.get());
    }
}
