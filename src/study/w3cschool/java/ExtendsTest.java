package study.w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/20.
 */
public class ExtendsTest {
    private int i;
    public String str;
    protected double dou;

    public static String func(String str) {
        System.out.println("This is F"+  str);
        return str;
    }

    public  void fund() {
        System.out.println("This is fund F");
    }

    ExtendsTest (String str) {
        this.str = str;
    }
}

