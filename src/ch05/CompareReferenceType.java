package ch05;

public class CompareReferenceType {
    // 참조 타입 비교
    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
        OutterClass outter2 = new OutterClass();

        // 전혀 다른 객체로 취급
        System.out.println(outter == outter2);

        String str = new String("hello");
        String str2 = new String("hello");

        System.out.println(str == str2);

        String str3="hello";
        System.out.println(str == str3);
        String str4="hello";
        System.out.println(str3 == str4);

        // 결론: 문자열을 비교하려면 equals()를 써라
    }

}
