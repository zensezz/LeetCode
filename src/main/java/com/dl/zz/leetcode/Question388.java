package com.dl.zz.leetcode;

import java.util.HashMap;
import java.util.Map;


// 假设我们以下述方式将我们的文件系统抽象成一个字符串:
//
//字符串 "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" 表示:
//
//dir
//    subdir1
//    subdir2
//        file.ext
//目录 dir 包含一个空的子目录 subdir1 和一个包含一个文件 file.ext 的子目录 subdir2 。
//
//字符串 "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" 表示:
//
//dir
//    subdir1
//        file1.ext
//        subsubdir1
//    subdir2
//        subsubdir2
//            file2.ext
//目录 dir 包含两个子目录 subdir1 和 subdir2。 subdir1 包含一个文件 file1.ext 和一个空的二级子目录 subsubdir1。subdir2 包含一个二级子目录 subsubdir2 ，其中包含一个文件 file2.ext。
//
//我们致力于寻找我们文件系统中文件的最长 (按字符的数量统计) 绝对路径。例如，在上述的第二个例子中，最长路径为 "dir/subdir2/subsubdir2/file2.ext"，其长度为 32 (不包含双引号)。
//
//给定一个以上述格式表示文件系统的字符串，返回文件系统中文件的最长绝对路径的长度。 如果系统中没有文件，返回 0。
//
//说明:
//
//文件名至少存在一个 . 和一个扩展名。
//目录或者子目录的名字不能包含 .。
//要求时间复杂度为 O(n) ，其中 n 是输入字符串的大小。
//
//请注意，如果存在路径 aaaaaaaaaaaaaaaaaaaaa/sth.png 的话，那么  a/aa/aaa/file1.txt 就不是一个最长的路径。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/longest-absolute-file-path

public class Question388 {

    // 解决方法
    // 切割字符 将原串分割开，相当于一次读一行
    //
    //利用字符串前面’\t’的个数来当前目录/文件在第几层。第一层0个，第二层在split(‘\n’)后前面就有一个\t...以此类推
    //
    //利用一个前缀和数组把前面几层的字符串长度都记下来，每次计算到包"."的文件时，说明到底了，更新下结果，再继续下一个计算，把数组前面的值覆盖掉
    //
        public int lengthLongestPath(String input) {
            int maxLen = 0, level = 1, cnt = 0;
            boolean isFile = false;

            Map<Integer, Integer> dir = new HashMap<>();
            dir.put(0, 0);

            char[] str = input.toCharArray();
            int i = 0, len = str.length;
            while (i < len) {
                while (str[i] == '\t') {
                    ++level;
                    ++i;
                }

                while (i < len && str[i] != '\n') {
                    if (str[i] == '.') isFile = true;
                    ++cnt;
                    ++i;
                }

                if (isFile) maxLen = Math.max(maxLen, dir.get(level - 1) + cnt);
                else dir.put(level, dir.get(level - 1) + cnt + 1);

                cnt = 0;
                level = 1;
                isFile = false;

                ++i;
            }

            return maxLen;
        }
}
