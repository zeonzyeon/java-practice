package ch02;

public class VariableExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 1000000000;

        // long 타입
        long longValue = 100; // (int -> long 컴파일 자동으로 형변환)
        long longValue2 = 10000000000L; // 100억 (int 정수형보다 훨씬 큰 순자, 숫자만 보고 int형을 생각) -> L 붙여주기

        // 실수값 저장
        float floatValue = 1.01234F; // F
        double doubleValue = 1.01234;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        // 정밀도 테스트
        float floatValue2 = 1.1234567890123456789F;
        double doubleValue2 = 1.1234567890123456789;

        System.out.println(floatValue2);
        System.out.println(doubleValue2);

        boolean stop = true;
        if (!stop) {
            System.out.println("중지합니다!");
        } else {
            System.out.println("시작합니다!");
        }
    }
}
