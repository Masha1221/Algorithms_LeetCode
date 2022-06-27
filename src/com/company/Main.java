package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (st.empty()) return false;
            else if (c == ')' && st.pop() != '(' || c == '}' && st.pop() != '{' || c == ']' && st.pop() != '[') {
                return false;
            }
        }
        return st.empty();
    }
}