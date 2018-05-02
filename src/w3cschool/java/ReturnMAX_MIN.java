package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class ReturnMAX_MIN {
    public static int max (int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(7,4));
    }
}
