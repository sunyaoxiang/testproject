package study.strategymodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class FastDriveImpl implements Drive{
    @Override
    public double getOil(double num1, double num2) {
        if (num1 <= num2 * 2.0) {
            return 0.0;
        }
        return num1 - (num2 * 2.0);
    }
}
