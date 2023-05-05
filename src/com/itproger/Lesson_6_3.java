package com.itproger;

import java.util.Scanner;

public class Lesson_6_3 {
    //https://www.youtube.com/watch?v=SdGp-5pcPeA&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> System.out.println("Your num is 1, am I right?");
            case 2 -> System.out.println("Why two?");
            case 322 -> System.out.println("Haha. U think it's funny, hah?");
            default -> System.out.println("Omg I can't guess your number");
        }
    }
}
