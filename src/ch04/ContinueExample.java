package ch04;

public class ContinueExample {
    public static void main(String[] args) {

        // 0~60 중에서 3의 배수 출력 (continue 사용)
        for (int i = 0; i < 60; i++) {
            int value = i + 1;

            if (value % 3 != 0) {
                continue;
            }
            System.out.println(value + " 는 3의 배수");
        }

        System.out.println("--------------------");

        // (continue 사용X)
        for (int i = 0; i < 60; i++) {
            int value = i + 1;

            if (value % 3 == 0) {
                System.out.println(value + "는 3의 배수");
            }
        }
    }
}
