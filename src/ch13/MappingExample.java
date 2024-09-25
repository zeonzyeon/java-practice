package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream()
                .map(element -> element.toUpperCase())
                .forEach(System.out::println);
        System.out.println("---------------------");
        // flatmap 2차원 -> 1차원
        Integer[][] array = {{3, 4}, {1, 2}};
        Arrays.stream(array)
                .flatMap(element -> Arrays.stream(element))
                .forEach(System.out::println);
        System.out.println("---------------------");
        // flatmap
        List<String> sentences = Arrays.asList("Hello World", "Java stream");
//        String[] strArray1 = {"Hello", "World"};
//        String[] strArray2 = {"Java", "Stream"};
        List<String> collect = sentences.stream()
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
