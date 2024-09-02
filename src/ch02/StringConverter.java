package ch02;

public class StringConverter {
    public static void main(String[] args) {
        // String -> 숫자 변환
        String str = "12345"; // int/Integer
        int primitiveStr = Integer.parseInt(str);
        Integer wrapperStr = Integer.valueOf(str);

        // String -> long/Long
        long primitiveLong = Long.parseLong(str);
        Long wrapperLong = Long.valueOf(str);

        String value = "10000.345";
        // String -> float/Float
        float primitiveFloat = Float.parseFloat(value);
        Float wrapperFloat = Float.valueOf(value);

        // String -> double/Double
        double primitiveDouble = Double.parseDouble(value);
        Double wrapperDouble = Double.valueOf(value);

        // 숫자 -> 문자열
        int intValue = 10;
        String s1 = intValue + "";
        String s2 = Integer.toString(intValue);
        String s3 =String.valueOf(intValue);

        System.out.println(intValue);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}