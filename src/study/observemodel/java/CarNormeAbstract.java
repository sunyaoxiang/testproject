package study.observemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarNormeAbstract extends Car {
    public CarNormeAbstract(MyCar car) {
        this.car = car;
        this.car.addCar(this);
    }

    @Override
    public  void dirve() {
        System.out.println("Driving norme, has oil: " + car.getOil());
    }
}