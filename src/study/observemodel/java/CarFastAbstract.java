package study.observemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarFastAbstract extends Car {
    public CarFastAbstract(MyCar car) {
        this.car = car;
        this.car.addCar(this);
    }

    @Override
    public  void dirve() {
        System.out.println("Driving fast, has oil: " + car.getOil());
    }
}