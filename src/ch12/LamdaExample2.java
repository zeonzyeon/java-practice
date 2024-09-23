package ch12;

import java.util.function.*;

public class LamdaExample2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "str";
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> 123;
        System.out.println(intSupplier.getAsInt());

        // Consumer
        Consumer<String> consumer = (a) -> System.out.println(a);
        consumer.accept("consumer");

        // Fuction
        Function<Integer, String> function = a -> String.valueOf(a) + ": 문자열";
        System.out.println(function.apply(456));

        Function<String, Double> function2 = a -> Double.valueOf(a) * 1.2;
        System.out.println(function2.apply("56.7"));

        // Predicate
        Predicate<String> isEmpty = a -> a.length() == 0;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("1234"));
    }
}
