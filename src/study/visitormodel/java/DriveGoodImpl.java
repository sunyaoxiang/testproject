package study.visitormodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveGoodImpl implements DriveVehicle{
    @Override
    public void doAction(DriveLevel driveLevel) {
        driveLevel.setLevel("Good");
        System.out.println(driveLevel.getVehicle() + " Level: " + driveLevel.getLevel());
    }
}
