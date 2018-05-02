package study.nullmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class EmployeeFactory {
    public static final String[] NAMES = {"Sun", "Huang", "Ma", "Jiang", "Zhang"};

    public static AbstractEmployee getCustomer(String name) {
        for (int i = 0; i < NAMES.length; i++) {
            if (NAMES[i].equalsIgnoreCase(name)) {
                return new Programmer(name);
            }
        }
        return new NullCustomer();
    }
}
