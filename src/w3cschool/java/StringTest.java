package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/17.
 */
public class StringTest {
    public static void main(String args[]) {
        float floateVar = 1222.0f;
        int intVar = 64;
        String stringVar = "string as";

        String fs;
        fs = String.format("The value of the folat varivale is " +
                            "%f, while the value of the integer " +
                            "variable is %d, and the string " +
                            "is %s", floateVar, intVar, stringVar);

        System.out.println(fs);
        System.out.println(fs.toString());
    }
}
