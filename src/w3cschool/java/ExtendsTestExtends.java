package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/20.
 */
public class ExtendsTestExtends extends ExtendsTest {
    public ExtendsTestExtends(String str) {
        super(str);
    }

    public void func() {
        System.out.println("There are " + this.str);
    }

    public static String func(String str) {
        System.out.println("There are " + str);
        return str;
    }

    public void fund() {
        func();
        func("ssda");
        super.func("DD");
        super.fund();
        System.out.println("This is ZfunD");
    }

    public void fund(String str) {
        func();
        func("ssda");
    }

    public  String fund(String str,String str2) {
        func();
        func("ssda");
        return str2;
    }

    public static void main(String[] args) {
        ExtendsTestExtends ext = new ExtendsTestExtends("Stest");
        ExtendsTest end = new ExtendsTest("Etest");
//        System.out.println(ext.str);
        ext.fund();
//        ext.func();
//        ext.func("ssda");
//        end.func("SSS");
//        System.out.println(ext.dou);
//        System.out.println(ext instanceof ExtendsTest);
//        System.out.println(end instanceof ExtendsTestExtends);
    }
}
