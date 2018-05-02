package w3cschool.java;
import java.util.*;

/**
 * Created by yaoxiang.sun on 2018/4/17.
 */
public class CalendarTest {


    public static void main(String args[]) {
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.DATE);
        c1.set(Calendar.DATE,10);
        System.out.println(c1.DATE);

    }
}
