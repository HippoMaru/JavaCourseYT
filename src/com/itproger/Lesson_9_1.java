package com.itproger;

import java.util.ArrayList;

public class Lesson_9_1 {
    //https://www.youtube.com/watch?v=MzNoISmsmpk&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=9
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(1, 30);

        for (int el: numbers){
            System.out.println(el);
        }

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.clear();
    }
}
