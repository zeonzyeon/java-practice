package ch07.computer;

public class Computer extends Calculator {
    private static final double PI = 3.14159;

    @Override   // 메소드 재정의 한다.
    double areaCircle(double r) {
        return Math.PI * r * r;
    }
}
