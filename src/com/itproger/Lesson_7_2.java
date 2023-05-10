package com.itproger;

public class Lesson_7_2 {
    //https://www.youtube.com/watch?v=wlKQBgJqPRs&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=7
    public static void main(String[] args) {
        for(int i = 5; i < 25; i += 2){
            if(i == 11){
                continue;
            }
            if(i == 21){
                break;
            }
            System.out.println("Element: " + i);
        }
    }
}
