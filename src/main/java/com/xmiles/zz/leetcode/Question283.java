package com.xmiles.zz.leetcode;

public class Question283 {

    public static  int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int[] num = new int[n];
        num[0] = 1;
        num[1] = 2;
        for (int i = 2; i < n; i++) {
            num[i] = num[i-1] +num[i-2];
        }
        return num[n-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
    }
}
