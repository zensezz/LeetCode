package com.dl.zz.offer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串
 * 为We%20Are%20Happy。
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","20%");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("sadsa SADSAD SAD")));
    }
}
 