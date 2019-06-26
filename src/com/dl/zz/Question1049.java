package com.dl.zz;

/**
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class Question1049 {
    public static int lastStoneWeightII(int[] stones) {
        int len = stones.length;
        int sum = 0;
        for (int i : stones) {
            sum += i;
        }
        int maxcapacity = sum/2;
        int[] dp = new int[maxcapacity + 1];
        for (int i = 0; i < len; i++) {
            int stone = stones[i];
            for (int j = maxcapacity; j >= stone; j--) {
                dp[j] = Math.max(dp[j], dp[j-stone] + stone);
            }
        }
        return sum - 2 * dp[maxcapacity];
    }

    public static void main(String[] args) {
        int i = lastStoneWeightII(new int[]{3, 8, 6, 9, 4, 2, 5, 3, 4,7});
        System.out.println(i);
    }
}
 