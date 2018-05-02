package study.nullmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class NullCustomer extends AbstractEmployee {

    @Override
    public String getName() {
        return "Not name Available.";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
