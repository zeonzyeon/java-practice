package ch06;

public class DefaultConstructor {
    String field;

    DefaultConstructor(String field) {
        this.field = field;
    }
    public static void main(String[] args) {
        DefaultConstructor dcTest = new DefaultConstructor("특정값");

        // DefaultConstructor dc2Test = new DefaultConstructor()
    }
}
