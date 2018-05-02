package w3cschool.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class StreamTest {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.read();
        System.out.println(br.readLine());


//        System.out.println("Enter characters, 'q' to quit.");
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c !='q');

    }
}
