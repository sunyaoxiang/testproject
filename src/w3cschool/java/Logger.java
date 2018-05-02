package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class Logger {
    private String format;

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    protected boolean openlogger(int num) {
        if (num >= 1) {
            return true;
        } else return false;
    }
}

class LoggerSon {
    boolean openlogger(int num) {
        if (num >= 1) {
            return true;
        } else return false;
    }
}
