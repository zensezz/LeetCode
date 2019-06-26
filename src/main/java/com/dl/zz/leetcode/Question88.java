package com.dl.zz.leetcode;

import java.util.Arrays;

/**
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class Question88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

}
 