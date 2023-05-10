package com.itproger;

import java.util.Scanner;

public class Lesson_8_2 {
    //https://www.youtube.com/watch?v=4oRyzq6Z4KE&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=8
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the number: ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for(int v: arr){
            if(v < min){
                min = v;
            }
        }
        System.out.println("Minimal value is " + min);
    }
}
