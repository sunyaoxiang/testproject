package study.w3cschool.java;

import java.text.NumberFormat;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class TestVoidMethod {
    public static void printWord(double score) {
//        Double dou_obj = new Double(score);
//        NumberFormat nf = NumberFormat.getInstance();
//        nf.setGroupingUsed(false);
        String str = Double.toString(score);
        System.out.println(str);
    }

    public static void printWord(String score) {
        System.out.println(score);
    }

    public static void main(String[] args) {
        printWord(1221213213);
        printWord("231231");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
