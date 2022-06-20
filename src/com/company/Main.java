package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode head1 = head;
        Stack<Integer> stack = new Stack();
        while (head1 != null) {
            stack.push(head1.val);
            head1 = head1.next;
        }
        while (!stack.isEmpty()) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}




