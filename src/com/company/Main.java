package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isHelp(root.left, root.right);
    }

    public boolean isHelp(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isHelp(t1.left, t2.right) && isHelp(t1.right, t2.left);
    }
}




