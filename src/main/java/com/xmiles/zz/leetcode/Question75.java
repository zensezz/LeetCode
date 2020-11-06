package com.xmiles.zz.leetcode;

public class Question75 {

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 0, 1, 0, 2, 2, 1};
        sortColors(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
