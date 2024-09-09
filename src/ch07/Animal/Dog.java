package ch07.Animal;

public class Dog extends Animal {

    Dog(String name) {
        // super(name);
        super(); // 부모 클래스의 생성자를 호출해줌
        System.out.println("Dog 객체 생성, name: " + name);
    }

    void sleep(int times) { // 오버로딩
        System.out.println(name + " Zzz..." + times + " hours");
    }

}
