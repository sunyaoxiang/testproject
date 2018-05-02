package study.strategymodel.java;

//import java.math.BigDecimal;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class StrategyModelMain {
    public static void main(String[] args) {
        DriveCar driveCar = new DriveCar(new FastDriveImpl());
        System.out.println(driveCar.doDrive(100.0,50.1));
//        System.out.println(new BigDecimal(driveCar.doDrive(100.0,49.9)));
        System.out.println(driveCar.doDrive(100.0,49.9));
        System.out.println(driveCar.doDrive(100.0,51.0));
        System.out.println(driveCar.doDrive(100.0,0.0));
        System.out.println(driveCar.doDrive(100.0,-1.0));

        driveCar = new DriveCar(new SlowDriveImpl());
        System.out.println(driveCar.doDrive(100,50));
    }
}
