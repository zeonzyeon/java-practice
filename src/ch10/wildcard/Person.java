package ch10.wildcard;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() { // Object에서 물려받은 toString() 재정의
        return getName();
    }
}
