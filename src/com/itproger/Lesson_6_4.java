package com.itproger;

import java.util.Scanner;

public class Lesson_6_4 {
    //https://www.youtube.com/watch?v=SdGp-5pcPeA&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        float v1 = scanner.nextFloat();
        System.out.println("Enter second value");
        float v2 = scanner.nextFloat();
        System.out.println("Switch the operator");
        scanner.nextLine();
        String operator = scanner.nextLine();
        switch (operator) {
            case "+" -> System.out.printf("result is %s", v1 + v2);
            case "-" -> System.out.printf("result is %s", v1 - v2);
            case "*" -> System.out.printf("result is %s", v1 * v2);
            case "/" -> {
                if (v2 != 0){
                    System.out.printf("result is %s", v1 / v2);
                }
                else {
                    System.out.println("Error: Division by zero");
                }
            }
            case "%" -> System.out.printf("result is %s", v1 % v2);
            default -> System.out.println("Error: Wrong operator");
        }
    }
}
