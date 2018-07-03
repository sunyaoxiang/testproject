package study;

import java.io.File;

/**
 * Created by yaoxiang.sun on 2018/6/11.
 */
public class Path {
    public static void main(String[] args) {
        //获取当前路径 1.
        String path = System.getProperty("user.dir");
        //获取当前路径 2.
        File directory = new File("..");
        try {
//             String canonicalPath = directory.getCanonicalPath();
//             String absolutePath = directory.getAbsolutePath();
            System.out.println(directory.getCanonicalPath());
            System.out.println(directory.getAbsolutePath());
            System.out.println(directory.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
