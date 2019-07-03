package com.dl.zz.leetcode;

/**
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 *
 * @Author zenghzong
 * @Since 2019/7/3
 * @Version 1.0
 */
public class Question242 {
    public static boolean isAnagram(String s, String t) {

        int[] cnts = new int[26];
        for (char c : s.toCharArray()) {
            cnts[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cnts[c - 'a']--;
        }
        for (int cnt : cnts) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("asdfghjkl","lkjhgfdsa"));
    }


}
 