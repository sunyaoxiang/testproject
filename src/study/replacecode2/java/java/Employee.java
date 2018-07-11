package study.replacecode2.java.java;

/**
 * Created by yaoxiang.sun on 2018/7/10.
 */
public class Employee {
    private EmployeeType type;

    private int monthlySalary = 100;
    private int commisssion = 2000;
    private int bonus = 30000;

    public int getMonthlySalary() {
        return monthlySalary;
    }
    public int getCommisssion() {
        return commisssion;
    }
    public int getBonus() {
        return bonus;
    }

    int payAmount() {
        return type.payAmount(this);
    }

    private Employee(int type) {
        setType(type);
    }

    int getType(){
        return type.getTypeCode();
    }

    void setType(int arg) {
        type = EmployeeType.newType(arg);
    }



    public static void main(String[] args) {
        Employee e = new Employee(2);
        System.out.println(e.payAmount());
        e.setType(0);
        System.out.println(e.payAmount());
        e.setType(1);
        System.out.println(e.payAmount());
    }
}
