package study.templatemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveMain {
    public static void main(String[] args) {
        Drive drive = new DriveBike();
        drive.stopVehicle();
        drive.driveOnLoad();
        drive = new DriveCar();
        drive.driveOnLoad();

    }
}
