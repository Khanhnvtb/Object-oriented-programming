package CodePtit;

import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') st.push(i);
                else {
                    st.pop();
                    if (!st.isEmpty()) res = Math.max(res, i - st.peek());
                    else st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
