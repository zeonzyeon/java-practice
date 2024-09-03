package ch03;

public class StringAppendSample {
    public static void main(String[] args) {

        System.out.println("Hello" + 123 + 456);
        System.out.println(123 + 456 + "Hello");

        String str1 = "hi";
        String str2 = "hi";
        String str3 = new String("hi");

        // 문자열 비교 이렇게 X
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        // equal() 사용
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }

}
