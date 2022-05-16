package File;

import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class J07077 {
    static int comp(char x) {
        if (x == '(') return 1;
        else if (x == '+' || x == '-') return 2;
        else if (x == '*' || x == '/') return 3;
        else return 4;
    }

    static boolean isOperator(char x) {
        if (x == '+' || x == '-' || x == '*' || x == '/') return true;
        return false;
    }

    static boolean isDigit(char c) {
        if (c >= '0' && c <= '9') return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("BIEUTHUC.in"));
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String str = in.nextLine();
            Stack<Character> stk = new Stack<>();
            String s = "";
            for (int i = 0; i < str.length(); i++) {
                if (isDigit(str.charAt(i))) {
                    s += str.charAt(i);
                    if (i == str.length() - 1 || !isDigit(str.charAt(i + 1))) s += '.';
                } else if (str.charAt(i) == '(') stk.push(str.charAt(i));
                else if (str.charAt(i) == ')') {
                    while (stk.size() > 0 && stk.peek() != '(') {
                        s += stk.peek();
                        stk.pop();
                    }
                    stk.pop();
                } else {
                    while (stk.size() > 0 && comp(stk.peek()) >= comp(str.charAt(i))) {
                        s += stk.peek();
                        stk.pop();
                    }
                    stk.push(str.charAt(i));
                }
            }
            while (stk.size() > 0 && stk.peek() != '(') {
                s += stk.peek();
                stk.pop();
            }
            long val = 0;
            Stack<Long> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (isOperator(s.charAt(i))) {
                    long x = st.peek();
                    st.pop();
                    long y = st.peek();
                    st.pop();
                    if (s.charAt(i) == '+') st.push(y + x);
                    else if (s.charAt(i) == '-') st.push(y - x);
                    else if (s.charAt(i) == '*') st.push(y * x);
                    else st.push(y / x);
                } else if (s.charAt(i) == '.') {
                    st.push(val);
                    val = 0;
                } else val = val * 10 + (s.charAt(i) - 48);
            }
            System.out.println(st.peek());
        }
    }
}
