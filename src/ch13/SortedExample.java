package ch13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("e","a","c","z","d");

        List<String> sortedList = list.stream()
                .sorted()
                .toList();
        System.out.println(sortedList); // 오름차순

        List<String> sortedList2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedList2); // 내림차순

    }
}
