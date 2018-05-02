package w3cschool.java;
import java.util.*;
import java.text.*;
/**
 * Created by yaoxiang.sun on 2018/4/17.
 */
public class DataTest {
    public static void main(String args[]) {
        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "2018-04-17" : args[0];
//        String input = "2011-04-17" ;
        System.out.println(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Using " + ft);
        }

//        System.out.println(ft.format(date));
//        String str = String.format("%tc",date);
//        System.out.print(str);
//        System.out.printf("%1$tB %1$td, %1$tC, %1$tj", date);
    }
}
