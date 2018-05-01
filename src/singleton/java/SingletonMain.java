package singleton.java;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getsingletonTest();
        SingletonTest singletonNull = SingletonTest.getsingletonNull();
        singletonTest.showmessage();
        if (singletonNull != null) {
            singletonNull.showmessage();
        }
    }
}
