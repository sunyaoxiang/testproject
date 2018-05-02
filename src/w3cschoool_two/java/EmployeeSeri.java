package w3cschoool_two.java;

/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class EmployeeSeri implements java.io.Serializable {
    public String name;
    public String address;
    public  int SSN;
    public  int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }

//    public EmployeeSeri(String name, String address, int SSN, int number) {
//        this.name = name;
//        this.address = address;
//        this.SSN = SSN;
//        this.number = number;
//    }
//
//    public static void main(String[] args) {
//        EmployeeSeri emp1 = new EmployeeSeri("Yaoxiang.Sun", "CN-068", 2321321, 213213);
//        emp1.mailCheck();
//        System.out.println(emp1.SSN);
//    }
}
