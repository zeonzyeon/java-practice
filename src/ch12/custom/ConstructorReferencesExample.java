package ch12.custom;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> func = (x) -> new Member(x);
        // 생성자 참조
        func = Member::new;

        BiFunction<String, String, Member> func2 = (x, y) -> new Member(x, y);
        func2 = Member::new;

    }
}
