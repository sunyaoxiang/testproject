package study.commandmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class CarBackImpl implements InterfaceDrive{
    private Car car;

    public CarBackImpl(Car car) {
        this.car = car;
    }

    public void go() {
        car.back();
    }
}
