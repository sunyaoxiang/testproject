package study.replacecode2.java.java;

/**
 * Created by yaoxiang.sun on 2018/7/10.
 */
abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract int getTypeCode();

    abstract int payAmount(Employee employee);

    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("No this type code existest");
        }
    }



}
