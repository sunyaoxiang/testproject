package study.mediationmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class MediationModelMain {
    public static void main(String[] args) {
        Machine machinex = new Machine("xMx");
        Machine machiney = new Machine("yMy");

        machinex.sendMessage("good");
        machiney.sendMessage("not pass");
    }
}
