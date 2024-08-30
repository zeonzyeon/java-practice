package ch01;

public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 126; // -128 ~ 127
        int var2 = 126; // +- 20억

        for (int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println(i + ") var1 = " + var1);
            System.out.println(i + ") var2 = " + var2);
        }
    }
}
