package w3cschool.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by yaoxiang.sun on 2018/4/18.
 */
public class RegexMatches {
    private static  String REGEX = "\\bcar\\b";
    private static  String INPUT = "car car car many cars in road, there are all car";

    public static void main(String args[]) {
        try {
            Pattern p = Pattern.compile(REGEX);
            Matcher m = p.matcher(INPUT);

//        String replace = "bus";
//        INPUT = m.replaceAll(replace);
//        System.out.println(INPUT);
//        replace = "taxi";
//        INPUT = m.replaceFirst(replace);
//        System.out.println(INPUT);
            String replace = "bus";
            StringBuffer sb = new StringBuffer();
            while (m.find()) {
                m.appendReplacement(sb, replace);
                System.out.println(sb.toString());
            }

            m.appendTail(sb);
            System.out.println(sb.toString());
        } catch (PatternSyntaxException e) {
            e.printStackTrace();
        }


//        System.out.println("lookingAt(): "+m.lookingAt());
//        System.out.println("matches(): "+m.matches());

//        int count = 0;
//        while (m.find()) {
//            count++;
//            System.out.println("Count number : " + count);
//            System.out.println("Start num is : " + m.start());
//            System.out.println("End num is : " + m.end());
//        }

    }
}