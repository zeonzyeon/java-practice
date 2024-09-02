package ch02;

public class Sample {
    public static void main(String[] args) {
        // String, 참조 자료형: new 예약어를 사용해서 변수를 초기화
        // String은 예외
        // String str = ""; // null 초기화
        String str1 = "실제값";
        String str2 = new String("실제값"); // 잘 사용하지 X
        String str3 = "실제값";
        String str4 = new String("실제값");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // false
        System.out.println(str2 == str4); // false

        // 박싱 (int -> Integer)
        int a = 10;
        Integer a2 = Integer.valueOf(a);

        Long.valueOf(10L);
        Float.valueOf(10.0f);
        Double.valueOf(3.14);

        // 오토 박싱
        Integer a3 = a;
    }
}
