package study.w3cschool.java;

import java.io.*;
import java.util.*;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class InputToUpper {


    public static void main(String args[]) {

        System.out.println("Please tupe in :");
        InputStreamReader ins = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ins);
        try {
            String inputstr = br.readLine();
            System.out.println(inputstr);

            FileWriter fw = null;
            File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(inputstr.toUpperCase(), 0, inputstr.length());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
