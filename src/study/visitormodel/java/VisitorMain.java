package study.visitormodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class VisitorMain {
    public static void main(String[] args) {
        DriveLevel level = new DriveLevel("Car");

        level.getVisitObject(new DriveGoodImpl());

//        level = new DriveLevel("Bus");

        level.getVisitObject(new DriveBadImpl());

    }
}
