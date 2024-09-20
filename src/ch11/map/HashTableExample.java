package ch11.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "B");
        hashtable.put("B", "C");
        hashtable.put("C", "D");
        hashtable.put("D", "E");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("아이디를 입력하세요.");
            String id = scanner.nextLine();

            System.out.println("패스워드를 입력하세요.");
            String pw = scanner.nextLine();

            if (hashtable.containsKey(id)) {
                if (hashtable.get(id).equals(pw)) {
                    System.out.println("로그인이 완료되었습니다.");
                    break;
                } else {
                    System.out.println("패스워드가 일치하지 않습니다.");
                }
            } else {
                System.out.println("아이디가 일치하지 않습니다.");
            }
        }
    }
}
