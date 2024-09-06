package ch06;

public class Person {
    final String nation;
    String name;

    Person(String name) {
        this.nation = "Korea"; // 생성자에서 final 필드
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("계백");

        System.out.println(person.nation);
        System.out.println(person.name);

        // person.nation = "을지문덕";   // Error: 컴파일 오류 발생. final 필드는 값 수정 불가
    }
}
