package study.Java8Test.java;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public class LambdaTest {
    interface addCount {
        int addo(int a, int b);
    }

    private int operate(int a, int b, addCount addcount) {
        return addcount.addo(a, b);
    }

    static addCount addcount = (a, b) -> {
        return a + b;
    };

    public static void main(String[] args) {
        LambdaTest l = new LambdaTest();
        System.out.println(l.operate(1,5,addcount));
        addCount addcount2 = (a, b) -> {
            return a + b + 1;
        };
        System.out.println(l.operate(1,5,addcount2));
    }
}
