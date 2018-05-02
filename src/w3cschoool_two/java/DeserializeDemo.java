package w3cschoool_two.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        EmployeeSeri e = null;
        try {
            FileInputStream fileIn = new FileInputStream("tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (EmployeeSeri) in .readObject();
            in.close();
            fileIn.close();
        } catch (IOException err) {
            err.printStackTrace();
            return;
        } catch (ClassNotFoundException cerr) {
            cerr.printStackTrace();
            return;
        }

        System.out.println(e.name);
    }
}
