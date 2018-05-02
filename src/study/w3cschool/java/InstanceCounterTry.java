package study.w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class InstanceCounterTry {
    private int numInstances = 0;
    protected  int getCount() {
        return numInstances;
    }

    private void addInstances() {
        numInstances++;
    }

    InstanceCounterTry() {
        addInstances();
    }


    public static void main(String [] args) {
        InstanceCounterTry instanceCounterTry = new InstanceCounterTry();
        System.out.println("Starting with " + instanceCounterTry.getCount() + " instances");
        for (int i = 0; i< 500; ++i) {new InstanceCounterTry();}
        System.out.println("Created " + instanceCounterTry.getCount() + " instances");
    }
    
}
