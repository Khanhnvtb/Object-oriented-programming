//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> st = new Stack<>();
        int val = in.nextInt();
        st.push(val);
        for (int i = 1; i < n; i++) {
            val = in.nextInt();
            if (!st.empty() && (val + st.peek()) % 2 == 0) st.pop();
            else st.push(val);
        }
        System.out.println(st.size());
    }
}
