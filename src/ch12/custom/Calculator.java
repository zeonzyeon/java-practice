package ch12.custom;

public class Calculator {
    // 정적 메소드
    static int staticMethod(int left, int right) {
        return left + right;
    }

    // 인스턴스 메소드
    public int method(int left, int right) {
        return left + right;
    }

}
