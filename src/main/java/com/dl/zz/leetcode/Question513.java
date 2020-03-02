package com.dl.zz.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//给定一个二叉树，在树的最后一行找到最左边的值。
//
//示例 1:
//
//输入:
//
//    2
//   / \
//  1   3
//
//输出:
//1
// 
//
//示例 2:
//
//输入:
//
//        1
//       / \
//      2   3
//     /   / \
//    4   5   6
//       /
//      7
//
//输出:
//7
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/find-bottom-left-tree-value
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class Question513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}



