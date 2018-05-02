package study.portfoliomodel.java;

public class PortFolioModelMain {
    public static void main(String[] args) {
        Employee CEO = new Employee("Yaoxiang", "QT");

        Employee headSell = new Employee("Gsdqw", "Sell");

        Employee headMarketing = new Employee("Hsoawnqw", "Marketing");

        Employee pro1 = new Employee("Pdwqwd qwdqw", "pro");Employee pro2 = new Employee("Suqqc qcqc", "pro");


        Employee test1 = new Employee("Sasdqw", "tester");
        Employee test2 = new Employee("uyrdsc", "tester");

        CEO.add(headSell);
        CEO.add(headMarketing);

        headSell.add(pro1);
        headSell.add(pro2);

        headMarketing.add(test1);
        headMarketing.add(test2);

        System.out.println(CEO);

        for (Employee heademployee : CEO.getEmployeeList()) {

            System.out.println(heademployee.toString());
            for (Employee employee : heademployee.getEmployeeList()) {
                System.out.println(employee.toString());
            }
        }
    }
}
