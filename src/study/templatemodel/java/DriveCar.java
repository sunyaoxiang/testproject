package study.templatemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveCar extends Drive{
    @Override
    public void getVehicle(){
        System.out.println("Get a Car.");
    }

    @Override
    public void checkVehcle() {
        System.out.println("It's ok.");
    }

    @Override
    public void startVehicle() {
        System.out.println("Start the car.");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Arrived safely.");
    }

}
