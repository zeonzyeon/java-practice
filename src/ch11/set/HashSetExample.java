package ch11.set;

import ch10.wildcard.Person;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet();

        // 값 추가
        hashSet.add("카리나");
        hashSet.add("윈터");
        hashSet.add("윈터");

        // 값 검색 (개수, 각 요소)
        System.out.println("총 개수 : " + hashSet.size());

        for (String str : hashSet) {
            System.out.println("\t" + str);
        }

        System.out.println("--------------------");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
            iterator.remove();
        }

        if (hashSet.isEmpty()) {
            System.out.println("비어있음 " + hashSet);
        }

        // 값 삭제
        hashSet.remove("카리나");

        System.out.println("--------------------");

        hashSet.clear();       // 모든 객체를 제거하고 비움
        if (hashSet.isEmpty()) {
            System.out.println("비어있음");
        }

        // hashCode(): 객체를 식별하는 정수형 값
        Person person1 = new Person("이름");
        Person person2 = new Person("이름");

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        System.out.println(personSet.size());

        System.out.println("--------------------");

        // name, age값이 같은 경우 같은 값으로 판별하기
        Member menber1 = new Member("홍길동", 30);
        Member menber2 = new Member("홍길동", 30);
        Set<Member> memberSet = new HashSet<>();
        memberSet.add(menber1);
        memberSet.add(menber2);
        System.out.println(memberSet.size());
    }
}