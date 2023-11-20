package de.telran.practic.twoSum;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
        int[] nums = {3,2,4};
//        int target = 9;
        int target = 6;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length; j++){
                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
                    System.out.println(i+", "+j);
                }
            }
        }
    }
}
