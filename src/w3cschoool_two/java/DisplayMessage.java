package w3cschoool_two.java;

/**
 * Created by yaoxiang.sun on 2018/4/26.
 */
public class DisplayMessage implements Runnable {
    private int counter = 0;
    private String message;
    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {

        while (this.counter < 10) {
            int guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.counter + " " + guess + " " + message);
            this.counter++;
        }
    }

    public static void main(String[] args) {
        Runnable hello = new DisplayMessage("Hello Thread");
        Thread t1 = new Thread(hello);
        t1.setDaemon(true);
        t1.setName("set hello");
        System.out.println("Starting hello thread..." + t1.getName());
        t1.start();
    }
}
