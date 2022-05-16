//Created by Khanhnvtb

package CodePtit;

import java.util.Scanner;
import java.util.Stack;

public class J08023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            long res = 0, mul;
            Stack<Integer> s = new Stack<>();
            int i = 0;
            while (i < n) {
                if (s.isEmpty() || a[s.peek()] <= a[i]) {
                    s.push(i++);
                } else {
                    int x = s.peek();
                    s.pop();
                    mul = (long) a[x] * (s.empty() ? i : i - s.peek() - 1);
                    res = Math.max(res, mul);
                }
            }
            while (!s.isEmpty()) {
                int x = s.peek();
                s.pop();
                mul = (long) a[x] * (s.empty() ? i : i - s.peek() - 1);
                res = Math.max(res, mul);
            }
            System.out.println(res);
        }
    }
}
