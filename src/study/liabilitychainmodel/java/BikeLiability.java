package study.liabilitychainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class BikeLiability extends AbstractLiability {
    public BikeLiability() {

    }

    @Override
    protected void printStr(String str) {
        System.out.println("Bike: " + str);
    }
}
 