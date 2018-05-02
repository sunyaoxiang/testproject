package Java8Test.java;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public interface carone {
    default void print() {
        System.out.println("ccarone");
    }

    default void printStatic(String name) {
        System.out.println("printStatic ccarone" + name);
    }
}
