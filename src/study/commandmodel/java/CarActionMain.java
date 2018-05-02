package study.commandmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarActionMain {
    public static void main(String[] args) {
        Car car = new Car();

        CarDriveImpl carDrive = new CarDriveImpl(car);
        CarBackImpl carBack = new CarBackImpl(car);

        CarAction carAction = new CarAction();
        carAction.takeCar(carDrive);
        carAction.takeCar(carDrive);
        carAction.takeCar(carDrive);
//        carAction.placeCars();
        carAction.takeCar(carBack);
        carAction.takeCar(carDrive);
        carAction.takeCar(carDrive);
        carAction.placeCars();
    }
}
