package ch05;

public class StringQuestion {
    // 연속된 문자의 반복 횟수로 문자열 압축하기
    public static void main(String[] args) {
        String str = "aaaabbccd";
        StringBuffer buffer = new StringBuffer();
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                buffer.append(str.charAt(i));
                buffer.append(count);
                count = 1;
            }
        }
        buffer.append(str.charAt(str.length() - 1));
        buffer.append(count);

        System.out.println(buffer);
    }
}
