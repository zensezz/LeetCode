package com.dl.zz.leetcode;

/**
 * @Author zenghzong
 * @Since 2019/6/25
 * @Version 1.0
 */
public class Question528 {
    public TreeNode convertBST(TreeNode root) {
        search(root, 0);
        return root;
    }
    public int search(TreeNode root, int n) {
        if(root == null)
            return n;
        int rightval = search(root.right, n);
        //右中左的中序遍历，所以相加的操作只用在中间做就行了，其他的就是把参数传递到下一层
        root.val += rightval;
        int leftval = search(root.left, root.val);
        //这里是把左中右三个节点里最后一个遍历的左子节点的返回值，返回给下一层
        return leftval;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

