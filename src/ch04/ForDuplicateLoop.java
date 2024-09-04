package ch04;

public class ForDuplicateLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {  // i = 0, 1, 2
            for (int j = 0; j < 4; j++) {  // j = 0, 1, 2, 3
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("------------------");

        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
