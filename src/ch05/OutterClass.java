package ch05;

public class OutterClass {
    public static void main(String[] args) { // args는 지역변수, 스택에 저장
        // 클래스 변수 접근
        System.out.println(ClassInstanceVariable.index);

        // 인스턴스 변수 접근 -> X
        // 인스턴스 변수는 특정 이름으로 객체를 생성해줘야 접근 가능
        ClassInstanceVariable object = new ClassInstanceVariable();
        System.out.println(object.index2);
    }
}
