package ch10.limit;

public class BoundedTypeExample {
    public static void main(String[] args) {
        int result = Util.compare(1, 2);
        System.out.println(result);

        int result2 = Util.compare(4.5, 1.2);
        System.out.println(result2);
    }
}
