package w3cschool.java;

import java.io.*;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class FileStreamTest {
    public static void main(String[] args) {
        try {
            String bWrite [] = {"11", "21", "32", "42", "5"};
            File file = new File("./src/w3cschool/test.txt");
            OutputStream os = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(os , "UTF-8");
            for (int x = 0; x < bWrite.length; x++) {
                writer.append(bWrite[x]);
            }
            writer.close();
            os.close();
            InputStream is = new FileInputStream(file);
            int size = is.available();
            for (int i = 0; i<size; i++) {
                System.out.println((char)is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
