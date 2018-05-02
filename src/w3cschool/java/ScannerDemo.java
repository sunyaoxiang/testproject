package w3cschool.java;

import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class ScannerDemo {
    public void deposit(double amount) throws RemoteException
    {
        // Method implementation
        throw new RemoteException();
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        System.out.println(str);

        try {
            Scanner scan2 = new Scanner(System.in);
            int str2 = scan2.nextInt();
            System.out.println(str2);
        } catch (Throwable err)
        {
            StackTraceElement a[] = err.getStackTrace();
            System.out.println(err.toString());
        }
    }
}
