package ch05;

public class StringInnerMethod {
    public static void main(String[] args) {
        String hello = "Hello Java";
        System.out.println(hello.indexOf("J"));

        String a = "Hello World!";
        System.out.println(a.replaceAll("World", "Spring"));

        String b = "Hello World!";
        System.out.println(b.substring(3, 5));
        System.out.println(b.substring(3));

        String c = "Hello World!";
        System.out.println(c.toUpperCase());
        System.out.println(c.toLowerCase());

        String str1 = "aaaabbccd";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        System.out.println("----------------------");

        String str2 = "Hello Welcome Java";
        String[] words = str2.split(" ");
        String result2 ="";

        for(int i=words.length-1;i>=0;i--){
            result2 += words[i];
            result2 += " ";
        }
        System.out.println(result2);

        System.out.println("----------------------");

        // 공백 제외해서 하나의 문자로 출력
        String str3 = " Hello Welcome Java ";
        String result3 = str3.replaceAll(" ","");
        System.out.println(result3);

//        equals(비교문자열)
//        indexOf(문자)
//        contains(특정 문자열)
//        charAt(특정위치 인덱스)
//        replaceAll(문자열, 문자열)
//        replace(regex, 문자열)
//        substring(시작인덱스, 끝인덱스)
//        toUpperCase()
//        toLowerCase()
//        split(구분자)
//        concat("합치고자 하는 문자열")
//        trim()
    }
}
