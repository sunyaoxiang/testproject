package study.statemodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class Drive {
    private Speed speed;
    private int num = 0;

    public Drive() {
        speed = null;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
