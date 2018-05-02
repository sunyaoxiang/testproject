package study.observemodel.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class MyCar {
    private List<Car> cars = new ArrayList<Car>();
    private int oil;

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
        tellOtherCars();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void tellOtherCars() {
        for (Car car : cars) {
            car.dirve();
        }
    }
}
