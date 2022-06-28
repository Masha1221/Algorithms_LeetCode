package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val != temp.val) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }

        return head;
    }
}