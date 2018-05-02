package study.w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/17.
 */
public class ArrayTest {
    String name;
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ";");
        }
    }

    public static double[] reverse(double[] list) {
        double[] result = new double[list.length];
        for (int i = 0, j = result.length- 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String args[]) {
        double[] mylist = {1.9, 2.9, 3.5, 3.8};
//        for (int i = 0; i < mylist.length; i++) {
//            System.out.println(mylist[i] + ";" );
//        }
//        double tatol = 0;
//        for (double y :mylist) {  // foreach循环
//            tatol = tatol + y;
//        }
//        System.out.println(tatol);
        printArray(mylist);
        reverse(mylist);
        printArray(mylist);
    }

//    public ArrayTest(String name) {
//        this.name = name;
//    }

}
