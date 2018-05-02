package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class VarargsDemo {
    public static void main(String[] args) {
        printMax(34, 3, 4, 23);
        printMax(new double[]{1, 2, 33, 45, 111});
    }

    private static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("Max is " + result);
    }

}
