package study.observemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarSlowAbstract extends Car {
    public CarSlowAbstract(MyCar car) {
        this.car = car;
        this.car.addCar(this);
    }

    @Override
    public  void dirve() {
        System.out.println("Driving slow, has oil: " + car.getOil());
    }
}