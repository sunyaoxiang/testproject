package study.w3cschoool_two.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class SerializeDemo {
    public static void main(String[] args) {
        EmployeeSeri e = new EmployeeSeri();
        e.name = "Yaoxiang.Sun";
        e.address = "068-CN";
        e.SSN = 7536435;
        e.number = 1120;
        try {
            FileOutputStream fileOut = new FileOutputStream("tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
