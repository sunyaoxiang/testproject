package study.replacecode2.java.java;

/**
 * Created by yaoxiang.sun on 2018/7/10.
 */
public class Manager extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getCommisssion();
    }
}
