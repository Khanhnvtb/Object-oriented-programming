//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.empty() && s.charAt(i) == st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        if (st.empty()) System.out.print("Empty String");
        else {
            ArrayList<Character> ans = new ArrayList<>();
            while (!st.empty()) {
                ans.add(st.peek());
                st.pop();
            }
            for (int i = ans.size() - 1; i >= 0; i--)
                System.out.print(ans.get(i));
        }
    }
}
