package ch13.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // NoSuchElementException 예외 발생
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (optionalDouble.isPresent()) {
            double avg = optionalDouble.getAsDouble();
            System.out.println(avg);
        }
    }
}
