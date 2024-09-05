package ch05;

public class StringFormatExample {
    // 문자열 포맷 (%s, %d, %f)
    public static void main(String[] args) {
        String str = ".........%s.....특정문자%s사이값";
        System.out.println(String.format(str,"치환값1","치환값2"));
        System.out.println(String.format(str,4,5));
        System.out.println(String.format(str,6324.412,73.31231));

        String str2 = "치환값1: %d ........ 치환값2: %d";
        System.out.println(String.format(str2,1,2));

        String str3 = "치환값1: %.2f ........ 치환값2: %f";
        System.out.println(String.format(str3,1.0,2.0));
    }
}
