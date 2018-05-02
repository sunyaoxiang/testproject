package study.statemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class FastSpeedImpl implements Speed {
    @Override
    public void doDrive(Drive drive) {
        System.out.println("Fast speed;");
        drive.setSpeed(this);
        drive.setNum(120);
    }

    public String toString() {
        return "Fast";
    }
}
