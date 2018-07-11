package study.replacecode2.java.java;

/**
 * Created by yaoxiang.sun on 2018/7/10.
 */
public class Engineer extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }
}
