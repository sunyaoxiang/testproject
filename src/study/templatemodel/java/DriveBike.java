package study.templatemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveBike extends Drive{
    @Override
    public void getVehicle(){
        System.out.println("Get a Bike.");
    }

    @Override
    public void checkVehcle() {
        System.out.println("It's ok.");
    }

    @Override
    public void startVehicle() {
        System.out.println("Start the bike.");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Arrived safely, but tired.");
    }

}
