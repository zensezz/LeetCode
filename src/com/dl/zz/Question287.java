package com.dl.zz;

import java.util.Arrays;

/**
 * @Author zenghzong
 * @Since 2019/6/25
 * @Version 1.0
 */
public class Question287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i>0){
                if (nums[i]==nums[i-1]){
                    result = nums[i] ;
                }
            }
        }
        return result;
    }
}
 