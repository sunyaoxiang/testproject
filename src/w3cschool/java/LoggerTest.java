package w3cschool.java;

/**
 * Created by yaoxiang.sun on 2018/4/16.
 */
public class LoggerTest {
    public  static void main(String []args) {
//        Logger logger = new Logger();
//        logger.setFormat("case");
//        String format = logger.getFormat();
//        System.out.println(format);
        Logger logger = new Logger();
        System.out.println(logger.openlogger(1));
        LoggerSon logger2 = new LoggerSon();
        System.out.println(logger2.openlogger(1));

    }
}
