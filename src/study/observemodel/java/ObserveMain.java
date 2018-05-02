package study.observemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class ObserveMain {
    public static void main(String[] args) {
        MyCar car = new MyCar();

        new CarFastAbstract(car);
        new CarSlowAbstract(car);
        new CarNormeAbstract(car);

        car.setOil(20);
        car.setOil(60);
    }
}
