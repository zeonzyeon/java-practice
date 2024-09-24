package ch13.optional;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> list = null;

        // Optional
        Optional<List<String>> optional = Optional.ofNullable(list);
        optional.orElseGet(Collections::emptyList)
                .forEach(System.out::println);

        Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .forEach(System.out::println);

        // Optional 객체 생성 (empty(), of(), ofNullable())
        Optional<Integer> empty = Optional.empty();
        OptionalInt empty2 = OptionalInt.empty();
        OptionalDouble empty3 = OptionalDouble.empty();

        Optional<Integer> optional2 = Optional.of(456);
        Optional<Integer> optional3 = Optional.of(789);

        // Optional 객체 꺼내기 (get(), orElse(), orElseGEt(), orElseThrow())
        Integer i = empty.orElseThrow(NoSuchElementException::new);
        System.out.println(i);

        // isPresent()
        if (optional.isPresent()) {
            Integer integer = optional3.get();
            System.out.println(integer);
        }

    }
}
