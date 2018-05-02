package study.w3cschoool_two.java;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class EnumerationTest {
    public static void main(String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Sun");
        dayNames.add("Mon");
        dayNames.add("Tue");
        dayNames.add("Wed");
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
