package ch10;

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        // 제네릭
        ArrayList<String> list = new ArrayList();
        list.add("10");
        list.add("12.45");
        list.add("문자열");

        String str = list.get(2);

        // 제네릭 X
        ArrayList<String> list2 = new ArrayList();
        list2.add("10");
        list2.add("12.45");
        list2.add("문자열");

        Object object = list2.get(2);
        int a = Integer.parseInt((String) object);
        System.out.println(a + 1);
    }
}
