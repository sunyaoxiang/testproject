package study.w3cschool.java;
import java.util.regex.*;

/**
 * Created by yaoxiang.sun on 2018/4/17.
 */
public class RegexTest {
    public static void main(String args[]) {
        String line = "This order was placed for QT30000! OK?";
        String pattern = "(.*)(\\d{4,5})(.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        System.out.println(m.groupCount());

//        m.find();

        if (m.find()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
    }
}
