package com.itproger;

import java.util.Scanner;

public class Lesson_5_2 {
    //https://www.youtube.com/watch?v=-RXEXP4-Iic&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=5
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        short num1 = 50, num2 = 11;
        float res = (float) num1 / num2;
        res += 10;
        res--;
        System.out.printf("Result is %s\n", res);

        System.out.println("Enter first value");
        float v1 = scan.nextFloat();
        System.out.println("Enter second value");
        float v2 = scan.nextFloat();
        float res1 = v1 + v2;
        float res2 = v1 - v2;
        float res3 = v1 * v2;
        float res4 = v1 / v2;
        float res5 = v1 % v2;
        System.out.printf("Results are %s %s %s %s %s\n", res1, res2, res3, res4, res5);
    }
}
