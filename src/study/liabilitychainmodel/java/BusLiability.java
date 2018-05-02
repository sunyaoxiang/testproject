package study.liabilitychainmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class BusLiability extends AbstractLiability {
    public BusLiability() {

    }

    @Override
    protected void printStr(String str) {
        System.out.println("Bus: " + str);
    }
}
 