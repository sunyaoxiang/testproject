package study.mediationmodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class Machine {
    private String name;

    public Machine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        Printer.showMessage(this, message);
    }
}
