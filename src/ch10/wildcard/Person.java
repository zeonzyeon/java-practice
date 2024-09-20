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

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return name.equals(person.getName());
        } else {
            return super.equals(obj);
        }
    }
}
