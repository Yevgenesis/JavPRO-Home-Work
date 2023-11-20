package de.telran.practic.pairsMinimized;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
//        makeSort(nums);
        Arrays.sort(nums);
        int maxSum = nums[0] + nums[nums.length-1];
        for (int i = 0; i < nums.length/2; i++) {
            if (maxSum < (nums[i] + nums[nums.length-1-i])) {
                maxSum = nums[i] + nums[nums.length-1-i];
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(maxSum);
    }
}
