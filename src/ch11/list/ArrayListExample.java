package ch11.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();   // 내부적으로 10(size) 할당

        // ArrayList 값 추가
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 총 개수 출력
        System.out.println("총 개수: " + list.size());

        // 값 순회 하면서 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + i + " : " + list.get(i));
        }

        // 값 삭제
        list.remove(2);
        list.remove(2);
        list.remove("Java");

        // 총 개수 출력
        System.out.println("총 개수: " + list.size());

        // 향상된 for문으로 순회하면서 값 출력
        for (String element : list) {
            System.out.println("\t" + element);
        }
    }
}
