package study.liabilitychainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarLiability extends AbstractLiability {
    public CarLiability() {

    }

    @Override
    protected void printStr(String str) {
        System.out.println("Car: " + str);
    }
}
