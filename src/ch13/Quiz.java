package ch13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        // 나이가 28세 이하인 사람들의 이름 [Alice, Charlie]
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );

        List<String> names = people.stream()
                .filter(person -> person.age >= 28)
                .map(person -> person.name)
                .toList();

        System.out.println(names);
    }
}
