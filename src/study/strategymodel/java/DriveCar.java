package study.strategymodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveCar {
    private Drive drive;

    public DriveCar(Drive drive) {
        this.drive = drive;
    }

    public double doDrive(double num1, double num2) {
        return drive.getOil(num1, num2);
    }
}
