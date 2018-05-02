package w3cschoool_two.java;

/**
 * Created by yaoxiang.sun on 2018/4/20.
 */
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Yaoxiang.Sun" ,"Qiaobei.Nanjing", 104, 4000.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

//        Employee e = new Employee("Dabao.Sun" ,"Jiangning.Nanjing", 108);
//        e.mailCheck();
    }
}