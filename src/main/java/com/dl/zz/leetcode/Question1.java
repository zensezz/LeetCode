package com.dl.zz.leetcode;

/**
 * @Author zenghzong
 * @Since 2019/6/25
 * @Version 1.0
 */
public class Question1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]+nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 8, 6, 4}, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
 