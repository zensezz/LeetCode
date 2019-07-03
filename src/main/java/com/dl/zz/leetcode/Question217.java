package com.dl.zz.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class Question217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }
}
 