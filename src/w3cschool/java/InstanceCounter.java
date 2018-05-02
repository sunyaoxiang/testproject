package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstances() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstances();
    }

    public void  as() {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i< 500; ++i) {new InstanceCounter();}
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }

    public static void main(String [] args) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i< 500; ++i) {new InstanceCounter();}
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }

}
