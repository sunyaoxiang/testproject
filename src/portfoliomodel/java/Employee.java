package portfoliomodel.java;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String title;
    private List<Employee> employeeList;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
        this.employeeList = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Employee name: "+ name + ", title: " + title + ". EmployeeList: " + employeeList;
    }
}
