package w3cschoool_two.java;

/**
 * Created by yaoxiang.sun on 2018/4/23.
 */
public class GenericsTest {
    public static <S> void printArray(S[] inputArray) {
        for (S element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"swq","erqw","bus","car"};
        Double[] doubleArray = {1.2,3.2,5.2,13.1};
        Character[] charArray = {'a','r','y','h'};
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
