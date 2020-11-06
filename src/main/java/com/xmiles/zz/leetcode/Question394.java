package com.xmiles.zz.leetcode;

//给定一个经过编码的字符串，返回它解码后的字符串。
//
//编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
//
//你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
//
//此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
//
//
//
//示例 1：
//
//输入：s = "3[a]2[bc]"
//输出："aaabcbc"
//示例 2：
//
//输入：s = "3[a2[c]]"
//输出："accaccacc"
//示例 3：
//
//输入：s = "2[abc]3[cd]ef"
//输出："abcabccdcdcdef"
//示例 4：
//
//输入：s = "abc3[cd]xyz"
//输出："abccdcdcdxyz"


import java.util.LinkedList;

public class Question394 {
    public static String decodeString(String s) {
            StringBuilder result = new StringBuilder();
            int multi = 0;
            LinkedList<Integer> stack_multi = new LinkedList<>();
            LinkedList<String> stack_res = new LinkedList<>();
            for(Character c : s.toCharArray()) {
                if(c == '[') {
                    stack_multi.addLast(multi);
                    stack_res.addLast(result.toString());
                    multi = 0;
                    result = new StringBuilder();
                }
                else if(c == ']') {
                    StringBuilder tmp = new StringBuilder();
                    int cur_multi = stack_multi.removeLast();
                    for(int i = 0; i < cur_multi; i++) {
                        tmp.append(result);
                    }
                    result = new StringBuilder(stack_res.removeLast() + tmp);
                }
                else if(c >= '0' && c <= '9') {
                    multi = multi * 10 + Integer.parseInt(c + "");
                } else {
                    result.append(c);
                }
            }
            return result.toString();
    }

    public static void main(String[] args) {
        String s = decodeString("2[sadsadas]3[esdfd]");
        System.out.println(s);
    }
}









