package ch03;

public class BitOperator {
    public static void main(String[] args) {
        int num = 8;
        int result = num >> 1;

        System.out.println("Original number: " + num);
        System.out.println("After shifting right by 1: " + result);

        // 비트 쉬프트 연산자
        int value=-8;
        System.out.println(value>>>1); // 2147483644 (32bit)
    }
}
