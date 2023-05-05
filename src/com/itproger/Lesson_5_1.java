package com.itproger;

import java.util.Scanner;

public class Lesson_5_1 {
    //https://www.youtube.com/watch?v=-RXEXP4-Iic&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=5
    public static void main(String[] args){
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name:");
        String username = scan.nextLine();
        System.out.printf("Hello, %s!\n", username);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.printf("Lmao you're only %s? Such a child...", age);
        byte b = scan.nextByte();
        double d = scan.nextDouble();
        //etc
    }
}
