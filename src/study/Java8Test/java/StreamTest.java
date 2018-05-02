package study.Java8Test.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.awt.SystemColor.menu;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> transaactionsIds = Arrays.asList(1, 2, 34, 31, 23, 12, 31, 3, 23, 12312, 312, 3);
        transaactionsIds.stream().filter(n -> n % 2 == 0).distinct().forEach(System.out::println);

//        List<Dish> vegetarian = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
//        numbers = Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
        Optional<Integer> max = transaactionsIds.stream().reduce(Integer::max);
        boolean is = max.isPresent();
        System.out.println(max);
    }
}
