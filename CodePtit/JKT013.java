package CodePtit;

import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int cnt = 0;
            for (int i = 1; i <= n; i++)
                cnt += Math.pow(2, i);
            n += 1;
            System.out.println(cnt);
            Queue<String> q = new LinkedList<>();
            Stack<String> s = new Stack<>();
            q.add("6");
            q.add("8");
            while (true) {
                String tmp = q.poll();
                if (tmp.length() == n) break;
                s.push(tmp);
                q.add(tmp + "6");
                q.add(tmp + "8");
            }
            while (!s.empty()) {
                System.out.print(s.peek() + " ");
                s.pop();
            }
            System.out.println();
        }
    }
}
