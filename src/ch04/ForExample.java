package ch04;

public class ForExample {
    public static void main(String[] args) {

        int[] array = new int[50];

        for (int i = 0; i < 50; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
