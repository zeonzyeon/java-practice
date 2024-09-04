package ch04;

public class ArgumentArraySample {
    public static void main(String[] args) {
        // java arguments로 입력받은 args배열 출력하기
        // 반드시 for문 이용

        for (int i = 0; i < args.length; i++) {
            // args[0] ~ args[5]
            System.out.println(args[i]);
        }
    }
}
