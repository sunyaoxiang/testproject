package study.threadstudy.java;

/**
 * Created by yaoxiang.sun on 2018/5/22.
 */
public class Learn15 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(3);
        for (int i = 1; i <= 5; i++) {
            RestaurantCustomer c = new RestaurantCustomer(restaurant, i);
            c.start();
        }
    }
}
