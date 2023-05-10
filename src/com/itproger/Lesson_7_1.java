package com.itproger;

public class Lesson_7_1 {
    //https://www.youtube.com/watch?v=wlKQBgJqPRs&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=7
    public static void main(String[] args) {

        for(float i = 100; i > 10; i /= 2){
            System.out.println("FOR Element: " + i);
        }

        int i = 0;
        while(i < 10){
            System.out.println("WHILE Element: " + i);
            i++;
        }

        do {
            System.out.println("DO WHILE Element: " + i);
            i -= 3;
        }   while(i > 0);
    }
}
