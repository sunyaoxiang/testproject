package w3cschoool_two.java;

/**
 * Created by yaoxiang.sun on 2018/4/26.
 */
public class GuessANumber extends Thread {
    private int number;
    public GuessANumber(int number) {
        this.number = number;
    }
    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guess " + guess);
            counter++;
        } while (guess != number);
        System.out.println("Right " + this.getName() + " in " + counter + " guesses.");
    }
}
