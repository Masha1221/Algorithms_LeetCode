package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int a = maxDepth(root.left);
        int b = maxDepth(root.right);

        return 1 + Math.max(a, b);
    }
}
