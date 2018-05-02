package study.iteratormodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class IteratorMain {
    public static void main(String[] args) {
        DriveCars cars = new DriveCars();

        for (Iterator iterator = cars.getIterator(); iterator.hasNext();) {
            String car = (String) iterator.next();
            System.out.println(car);

//            System.out.println(iterator.next());
        }
    }
}
