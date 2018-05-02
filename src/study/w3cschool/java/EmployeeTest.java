package study.w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class EmployeeTest {
    public static void main(String []args) {
        System.out.println(Employee.DEPARTMENT);

        Employee empOne = new Employee("Sun");
        Employee empTwo = new Employee("Li");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();
//        System.out.println(empOne.name);
//        System.out.println(empOne.age);
//        empOne.DEPARTMENT = "case";
//        System.out.println(empOne.DEPARTMENT);
//        empOne.name = "case";
//        System.out.println(empOne.name);
//        empOne.printEmployee();
//        empOne.salary = 2000;
//        System.out.println(empOne.salary);

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.printEmployee();
        empTwo.empSalary(500);
        empOne.printEmployee();
        empTwo.printEmployee();
//
//        empTwo.name = "Two name";
//        empTwo.printEmployee();

//        Test testOne = new Test();
//        testOne.pupAge();

    }
}
