//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length() - 1;
        Stack<Character> s = new Stack<>();
        s.push(str.charAt(n));
        for (int i = n - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= s.peek()) s.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while (!s.empty()) {
            ans.append(s.peek());
            s.pop();
        }
        System.out.println(ans);
    }
}
