package ch04;

public class ForContinueExample {
    public static void main(String[] args) {
        int x = 0;
        while (x < 60) {
            x++;
            if (x % 3 != 0) {
                continue;
            }
            System.out.println(x);
        }
    }
}
