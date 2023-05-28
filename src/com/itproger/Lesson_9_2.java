package com.itproger;

import java.util.LinkedList;

public class Lesson_9_2 {
    //https://www.youtube.com/watch?v=MzNoISmsmpk&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=9
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(3.2f);
        numbers.add(-4.7f);

        for(float el: numbers){
            System.out.println(el);
        }
    }
}
