package study.statemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class StateMain {
    public static void main(String[] args) {
        Drive drive = new Drive();

        FastSpeedImpl fastSpeed = new FastSpeedImpl();
        fastSpeed.doDrive(drive);
//        System.out.println(drive.getSpeed());
        System.out.println(drive.getNum());

        SlowSpeedImpl slowSpeed = new SlowSpeedImpl();
        slowSpeed.doDrive(drive);
//        System.out.println(drive.getSpeed());
        System.out.println(drive.getNum());

        NormeSpeedImpl normeSpeed = new NormeSpeedImpl();
        normeSpeed.doDrive(drive);
//        System.out.println(drive.getSpeed());
        System.out.println(drive.getNum());
    }
}
