package CodePtit;


import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            int res[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            res[n - 1] = -1;
            Stack<Integer> s = new Stack<>();
            s.push(a[n - 1]);
            for (int i = n - 2; i >= 0; i--) {
                while (!s.isEmpty() && a[i] >= s.peek()) s.pop();
                if (!s.isEmpty()) res[i] = s.peek();
                else res[i] = -1;
                s.push(a[i]);
            }
            for (int i = 0; i < n; i++) System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
