package study.singleton.java;

public class SingletonTest {
    private final static SingletonTest singletonTest = new SingletonTest();

    private SingletonTest() {

    }

    public static SingletonTest getsingletonTest() {
        return singletonTest;
    }

    public static SingletonTest getsingletonNull() {
        SingletonTest singletonTest = null;
        return singletonTest;
    }

    public void showmessage() {
        System.out.println("This is a singleton example");
    }
}
