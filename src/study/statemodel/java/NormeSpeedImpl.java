package study.statemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class NormeSpeedImpl implements Speed {
    @Override
    public void doDrive(Drive drive) {
        System.out.println("Norme speed;");
        drive.setSpeed(this);
        drive.setNum(60);
    }

    public String toString() {
        return "Norme";
    }
}
