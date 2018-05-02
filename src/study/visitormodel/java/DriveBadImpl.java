package study.visitormodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveBadImpl implements DriveVehicle{
    @Override
    public void doAction(DriveLevel driveLevel) {
        driveLevel.setLevel("Bad");
        System.out.println(driveLevel.getVehicle() + " Level: " + driveLevel.getLevel());
    }
}
