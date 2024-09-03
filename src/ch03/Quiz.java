package ch03;

public class Quiz {
    public static void main(String[] args) {
        int num = 3;

        // if 조건절
        if (num % 2 == 0)
            System.out.println("짝수입니다");
        else
            System.out.println("홀수입니다");

        // 삼항 연산자
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

        int a = 5;
        int b = 8;

        System.out.println((a >= b) ? a : b);

        int score = 55;
        System.out.println((score >= 60) ? "합격" : "불합격");
    }
}
