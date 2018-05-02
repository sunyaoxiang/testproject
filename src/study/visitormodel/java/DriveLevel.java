package study.visitormodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveLevel {
    private String vehicle;
    private String level = "Normal";

    public DriveLevel(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return this.vehicle;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return this.level;
    }

    public void getVisitObject(DriveVehicle driveVehicle) {
        driveVehicle.doAction(this);
    }
}
