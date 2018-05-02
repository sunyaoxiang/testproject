package w3cschool.java;
import java.io.*;
/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class Employee {
    public String name; //对子类可见
    int age;
    String designation;
//    private static double salary ; //静态的私有变量
    public static double salary ;
    public static final String DEPARTMENT = "Development";


    public Employee(String name) {
        this.name = name;
    }
    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Designation :" + designation);
        System.out.println("Salary :" + salary);
    }
}
