package study.replacecode.java;

/**
 * Created by yaoxiang.sun on 2018/7/10.
 */
public abstract class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
//        if (type == ENGINEER) return new Engineer();
//        else return null;
        switch (type) {
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

//    private Employee(int type) {
//        this.type = type;
//    }

    abstract int getType();

    public static void main(String[] args) {
        Employee e = Employee.create(ENGINEER);
        System.out.println(e.getType());
        Employee s = Employee.create(SALESMAN);
        System.out.println(s.getType());
        Employee m = Employee.create(MANAGER);
        System.out.println(m.getType());
    }
}
