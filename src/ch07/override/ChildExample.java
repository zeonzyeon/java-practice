package ch07.override;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();    // child에 재정의한 메소드
        child.method3();
    }
}
