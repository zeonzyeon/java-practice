package ch06;

class Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
// 자바는 객체 지향 !
public class ClassSample {
    public static void main(String[] args) {
        System.out.println(Calculator1.add(5));
        System.out.println(Calculator1.add(4));

        System.out.println(Calculator2.add(1));
        System.out.println(Calculator2.add(10));
    }
}
