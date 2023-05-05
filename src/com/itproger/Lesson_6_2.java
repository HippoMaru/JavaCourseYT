package com.itproger;

import java.util.Objects;
import java.util.Scanner;

public class Lesson_6_2 {
    //https://www.youtube.com/watch?v=SdGp-5pcPeA&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=6
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your role?");
        String role = scanner.nextLine();
        if (role.equals("admin")){
            System.out.println("U sure? What is the password than?");
            if (scanner.nextLine().equals("password")){
                System.out.println("I'm sorry. Welcome home, almighty admin");
            }
            else {
                System.out.println("Such a liar, go out!");
            }
        }
        else {
            System.out.println("You are not welcome here, what is ur name?");
            String name = scanner.nextLine();
        }
    }
}
