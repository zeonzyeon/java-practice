package ch11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // map 객체 선언
        Map<String, Integer> hashMap = new HashMap<>();

        // key, value 값 추가
        hashMap.put("전지현", 10);
        hashMap.put("전서현", 20);
        hashMap.put("전서현", 30);

        System.out.println(hashMap.get("key")); // null
        System.out.println(hashMap.getOrDefault("key", 0)); // "key" 값이 없으면 0으로 세팅

        System.out.println("--------------------");
        System.out.println(hashMap.size());

        // 각 key, value 순회하면서 출력 (keySet(), entrySet()
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            Integer value = hashMap.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("--------------------");

        // 하나의 Set 안에 여러 개의 Entry
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
