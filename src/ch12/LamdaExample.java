package ch12;

import ch12.custom.MyFunctionalInterface2;
import ch12.custom.MyfunctionalInterface;
import ch12.custom.MyfunctionalInterface3;
import ch12.custom.MyfunctionalInterface4;

public class LamdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 객체의 메서드");
            }
        };      // 익명 구현 객체

        Runnable runnable1 = () -> System.out.println("익명 구현 객체의 메서드");

        MyfunctionalInterface inter = new MyfunctionalInterface() {
            @Override
            public void run() {
                System.out.println("Hello Lamda1");
                System.out.println("Hello Lamda2");
                System.out.println("Hello Lamda3");

            }
        };
        inter.run();

        MyfunctionalInterface inter1 = () -> {
            System.out.println("Hello Lamda1");
            System.out.println("Hello Lamda2");
            System.out.println("Hello Lamda3");
        };
        inter1.run();

        // 매개변수가 있는 람다식
        MyFunctionalInterface2 inter2 = (x) -> System.out.println(x);
        inter2.method(10);

        // 매개변수와 리턴타입이 있는 람다식 (매개변수 1개)
        MyfunctionalInterface3 inter3 = a -> a * a;
        System.out.println(inter3.method(11));

        // 매개변수와 리턴타입이 있는 람다식 (매개변수 2개)
        MyfunctionalInterface4 inter4 = (a, b) -> a + b;
        System.out.println(inter4.method(12,13));

    }
}
