package study.templatemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
abstract class Drive {
    abstract void getVehicle();
    abstract void checkVehcle();
    abstract void startVehicle();
    abstract void stopVehicle();

    public final void driveOnLoad() {
        getVehicle();
        checkVehcle();
        startVehicle();
        stopVehicle();
    }
}
