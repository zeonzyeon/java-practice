package ch01;

import java.util.HashMap;

public class Sample { // 클래스명은 파스칼 표기법
    // 변수, 메서드, 파일명은 카멜 표기법
    // 주석 작성
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // 히스토리 작성? O / X
        // ~~~ 역할하는 코드
        HashMap map = new HashMap(); // 자바에서 제공하는 클래스
        map.put("", "");

        int index = 1; // 변수명 중요
        // 결과, 만들어내는 과정 (알고리즘, 자료구조, 프로그램)

        int value = 0; // 변수에 초기값을 할당
        int result = value + 10;

        System.out.println(result);
    }

    public int getResult() {
        int result = 11; // 변수 선언
        // 예약어로 변수 이름을 지정하면 컴파일 에러 발생
        int _value = 1;
        int $value = 2;

        return result;
    }

    void 의미있는_네이밍() {

    }
}
