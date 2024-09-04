package ch04;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i % 3 == 0)
                System.out.println(i);
        } while (i < 60);
    }
}
