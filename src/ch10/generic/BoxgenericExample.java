package ch10.generic;

public class BoxgenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("문자열");
//        box. set(10); // 다른 타입은 입력 불가 (컴파일 오루)
        String str = box.get();
        System.out.println(str);
        // 제네릭을 사용하면 타입을 변환해주지 않아도 됨

        Box<Integer> intBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        Box<Boolean> booleanBox = new Box<>();
        // 제네릭은 primitive 타입은 X
        // Rapper, 참조 타입만 들어갈 수 있음

        // 제네릭 메소드
        Box<String> value = Util.boxing("문자열값");    // ?
//        Box<String> value2 = Util.boxing("12345");
    }
}

