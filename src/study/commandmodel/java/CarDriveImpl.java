package study.commandmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarDriveImpl implements InterfaceDrive{
    private Car car;

    public CarDriveImpl(Car car) {
        this.car = car;
    }

    public void go() {
        car.drive();
    }
}
