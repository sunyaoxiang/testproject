package study.nullmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class NullModelMain {
    public static void main(String[] args) {
        AbstractEmployee employee1 = EmployeeFactory.getCustomer("Sun");
        AbstractEmployee employee2 = EmployeeFactory.getCustomer("Xi");
        AbstractEmployee employee3 = EmployeeFactory.getCustomer("Ting");
        AbstractEmployee employee4 = EmployeeFactory.getCustomer("Jiang");
        AbstractEmployee employee5 = EmployeeFactory.getCustomer("Liu");

        System.out.println(employee1.getName());
        System.out.println(employee2.getName());
        System.out.println(employee3.getName());
        System.out.println(employee4.getName());
        System.out.println(employee5.getName());
    }
}
