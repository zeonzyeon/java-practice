package ch04;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------");

        int treeHit = 0;

        while (treeHit < 10) {
            treeHit++;  // treeHit += 1 로도 표현 가능
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
    }
}
