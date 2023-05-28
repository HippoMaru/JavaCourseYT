package com.itproger;

public class Lesson_8_3 {
    //https://www.youtube.com/watch?v=4oRyzq6Z4KE&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=8
    public static void main(String[] args) {
        char[][] syms = new char[2][3];
        syms[0][0] = 'g';
        System.out.println(syms[0][0]);

        byte[][] nums_arrays = new byte[][] {
                {3, 2, 2, -6},
                {1, 4, -4, 8},
                {2, 1, 7}
        };
        for (byte[] num_array : nums_arrays){
            for(byte num: num_array){
                System.out.println(num);
            }
            System.out.println();
        }
    }
}
