package ch03.programmers;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 number, n, m을 입력받습니다.
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        // solution 메서드를 호출하여 결과를 받습니다.
        Solution sol = new Solution(); // 객체를 생성
        int result = sol.solution(number, n, m);

        // 결과를 출력합니다.
        System.out.println("Result: " + result);

        sc.close(); // Scanner를 닫아줍니다.
    }
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number%n==0&&number%m==0)
            answer=1;
        else
            answer=0;

        return answer;
    }
}
