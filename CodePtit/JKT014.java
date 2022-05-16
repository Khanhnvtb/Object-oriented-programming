package CodePtit;

import java.util.Scanner;
import java.util.Stack;

public class JKT014 {
    static class Data {
        int value, index;

        public Data(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            Stack<Data> s = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!s.empty() && a[i] >= s.peek().value) s.pop();
                if (s.empty()) System.out.print(i + 1 + " ");
                else System.out.print(i - s.peek().index + " ");
                s.push(new Data(a[i], i));
            }
            System.out.println();
        }
    }
}
