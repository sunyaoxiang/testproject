package study.w3cschoool_two.java;

/**
 * Created by yaoxiang.sun on 2018/4/20.
 */
public class Salary extends Employee {
    public double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay() {
        System.out.println("Compute salary pay for " + getName());
        return salary/52;
    }
}
