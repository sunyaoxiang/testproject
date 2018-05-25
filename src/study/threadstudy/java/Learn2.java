package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/18.
 */
public class Learn2 {
    private static int tagNum = 1;

    public static void tagNumAdd() {
        System.out.println("Start: " + tagNum);
        tagNum = tagNum + 1;
        tagNum = tagNum - 1;
        System.out.println("End: " + tagNum);
    }

    public static void tagNumChange() {
        int numChange = tagNum;
        if (numChange != 1) {
            System.out.println("TagNum changed: " + numChange);
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
           while (true) {
               tagNumAdd();
           }
        });
        t1.start();

        t1 = new Thread(() -> {
           while (true) {
               tagNumChange();
           }
        });
        t1.start();
    }
}
