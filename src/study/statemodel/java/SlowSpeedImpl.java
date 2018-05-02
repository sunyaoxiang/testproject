package study.statemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class SlowSpeedImpl implements Speed {
    @Override
    public void doDrive(Drive drive) {
        System.out.println("Slow speed;");
        drive.setSpeed(this);
        drive.setNum(30);
    }

    public String toString() {
        return "Slow";
    }
}
