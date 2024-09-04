package ch04;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};

        for(String number : numbers) {
            System.out.println(number);
        }

        System.out.println("---------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
