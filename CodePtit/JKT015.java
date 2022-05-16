package CodePtit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class JKT015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Deque<Character> dq = new ArrayDeque<>();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                if (!dq.isEmpty()) {
                    st.push(dq.pollLast());
                }
            } else if (s.charAt(i) == '-') {
                if (!dq.isEmpty()) dq.pollLast();
            } else if (s.charAt(i) == '>') {
                if (!st.isEmpty()) {
                    dq.addLast(st.peek());
                    st.pop();
                }
            } else dq.addLast(s.charAt(i));
        }
        while (!dq.isEmpty()) {
            System.out.print(dq.pollFirst());
        }
        while (!st.isEmpty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }
}
