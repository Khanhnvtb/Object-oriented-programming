package CodePtit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);
            while (!q.isEmpty()) {
                int res = q.poll();
                if (res % n == 0) {
                    System.out.println(res);
                    break;
                } else {
                    q.add(res * 10);
                    q.add(res * 10 + 9);
                }
            }
        }
    }
}
