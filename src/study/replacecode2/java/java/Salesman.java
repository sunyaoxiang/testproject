package study.replacecode2.java.java;

/**
 * Created by yaoxiang.sun on 2018/7/10.
 */
public class Salesman extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }
}
