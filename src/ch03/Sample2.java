package ch03;

public class Sample2 {
    public static void main(String[] args) {
        // 이항 연산자
        byte x = 45;
        byte y = 67;

        int result = x + y;
        System.out.println(result);

        System.out.println("---------------------");

        int x2 = 40;
        double y2 = 50.34;

        int intResult = (int) (x2 + y2);
        double doubleResult = x2 + y2;

        System.out.println(intResult);
        System.out.println(doubleResult);
    }
}
