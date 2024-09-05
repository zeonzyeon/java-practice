package ch05;

public class StringBuilderBufferExample {
    // StringBuffer, StringBuilder -> String 보다 성능이 좋음 (문자열 이어붙이는거)
    public static void main(String[] args) {
        String result = "";
        result += "Hello ";
        result += "Java ";
        result += "World!";
        System.out.println(result);

        // 장점: thread safe
        StringBuffer buffer = new StringBuffer(); // 하나의 클래스이기 때문에 생성해줘야함
        buffer.append("Hello ");
        buffer.append("Java ");
        buffer.append("World!");
        System.out.println(buffer);

        // 장점: 성능 우수 / 동시 실행 가능
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("Java ");
        builder.append("World!");
        System.out.println(builder);

        // insert()
        System.out.println(builder.insert(0, "첫번째 "));
        System.out.println(builder.insert(builder.length(), "마지막"));

        // substring()
        System.out.println(buffer.substring(6));
        System.out.println(buffer.substring(6,10));
    }
}
