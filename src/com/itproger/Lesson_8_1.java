package com.itproger;

public class Lesson_8_1 {
    //https://www.youtube.com/watch?v=4oRyzq6Z4KE&list=PLDyJYA6aTY1lT614ixLYq48har7EnCXpk&index=8
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 3;
        int res = nums[2] + nums[3];
        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
        System.out.println(nums2[1]);

        for (float v : nums2) {
            System.out.println("Element:" + v);
        }
    }
}
