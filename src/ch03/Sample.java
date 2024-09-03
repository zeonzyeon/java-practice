package ch03;

public class Sample {
    public static void main(String[] args) {
        // 단항연산자 - 증감 전/후위 연산자
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        System.out.println(result1); // -100
        System.out.println(result2); // 100

        int y = 5;
        int z = 5;
        int result3 = y++;
        int result4 = ++z;

        System.out.println(result3); // 5
        System.out.println(result4); // 6

        int a = 5;
        int result5 = a--;
        System.out.println(result5); // 5
        System.out.println(a); // 4

        int b = 14;
        int result6 = --b;
        System.out.println(result6); // 13
        System.out.println(b); // 13

        int c = 14;
        int result7 = --c;
        System.out.println(result7); // 13
        System.out.println(--c); // 12

    }
}
