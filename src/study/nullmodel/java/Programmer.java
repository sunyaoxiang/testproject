package study.nullmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class Programmer extends AbstractEmployee {
    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
