package ch13;

import java.util.Arrays;
import java.util.List;

public class LoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 짝수를 걸러내서 총 합 구하기
        int sum = list.stream()
                .mapToInt(element -> element)
                .filter(element -> element % 2 == 0)
                .peek(System.out::println) // 가공
                .sum(); // 결과
        System.out.println("짝수들의 총 합: " + sum);

        // forEach 사용해서 필터링된 stream 요소 출력
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));   // [2, 4]
    }
}
