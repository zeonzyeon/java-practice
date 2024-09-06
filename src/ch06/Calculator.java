package ch06;

public class Calculator {
    int a = 10; // 객체변수

    Calculator() {
        // 디폴트 생성자
    }

    Calculator(int a) {
        this.a = a;
    }

    int postfixOperator(int a) {
        a++;
        return a;
    }

    void postfixOperator() {
//        this.a++;
        a++;
    }

    void postfixOperator(Calculator cal) {
        cal.a++;
    }

    public static void main(String[] args) {
        int a = 0;
        Calculator calc = new Calculator();
        a = calc.postfixOperator(a); // 메소드 타입 변경
        System.out.println(a);

        // Calculator calc 객체를 매개변수로 전달
        Calculator calc2 = new Calculator(1);
        calc2.postfixOperator(calc2);
        System.out.println(calc2.a);

        //
        Calculator calc3 = new Calculator(2);
        calc3.postfixOperator();
        System.out.println(calc3.a);
    }
}
