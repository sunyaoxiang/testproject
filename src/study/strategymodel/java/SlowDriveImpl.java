package study.strategymodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class SlowDriveImpl implements Drive{
    @Override
    public double getOil(double num1, double num2) {
        if (num1 <= num2 * 0.5) {
            return 0.0;
        }
        return num1 - (num2 * 0.5);
    }
}
