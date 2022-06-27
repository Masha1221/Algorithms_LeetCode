package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Integer> integers = new ArrayList<Integer>();

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                inorderTraversal(root.left);
            }
            integers.add(root.val);
            if (root.right != null) {
                inorderTraversal(root.right);
            }
        }
        return integers;
    }
}




