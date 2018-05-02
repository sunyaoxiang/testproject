package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class InstanceCounterTest {
    public static void main(String [] args) {
        new InstanceCounter();
        new InstanceCounter();
        InstanceCounter insta = new InstanceCounter();
        insta.as();
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }
}
