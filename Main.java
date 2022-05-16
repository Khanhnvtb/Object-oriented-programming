import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt(), e = in.nextInt(), s = in.nextInt();
        LinkedList<Integer> a[] = new LinkedList[v + 1];
        for (int i = 1; i <= v; i++)
            a[i] = new LinkedList<>();
        while (e-- > 0) {
            int i = in.nextInt(), j = in.nextInt();
            a[i].add(j);
            a[j].add(i);
        }
        TimKiem.dfs(a, s, v);
        TimKiem.bfs(a, s, v);
    }
}
