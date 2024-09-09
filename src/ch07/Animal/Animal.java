package ch07.Animal;

public class Animal {
    String name;

    Animal() { // 부모 객체가 먼저 생성됨
        System.out.println("Animal 객체 생성");
    }

    void setName(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(this.name + " Zzz...");
    }
}
