package ch02.casting;

public class ForceCasting {
    public static void main(String[] args) {
        // long -> int
        long longValue = 300;
        int intValue = (int) longValue; // 캐스팅

        // double -> int
        double pi = 3.14;
        int convertedInt = (int) pi; // 캐스팅
        System.out.println("convertedInt = " + convertedInt);
    }
}
