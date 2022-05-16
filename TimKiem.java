import java.util.*;

public class TimKiem {
    public static void dfs(LinkedList<Integer>[] a, int s, int V) {
        Vector<Boolean> visited = new Vector<Boolean>(V);
        for (int i = 0; i <= V; i++)
            visited.add(false);
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        System.out.print("Đường đi theo DFS: ");
        while (stack.empty() == false) {
            s = stack.peek();
            stack.pop();
            if (visited.get(s) == false) {
                System.out.print(s + " ");
                visited.set(s, true);
            }
            Iterator<Integer> itr = a[s].iterator();
            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited.get(v)) {
                    stack.push(v);
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void bfs(LinkedList<Integer>[] a, int s, int V) {
        boolean visited[] = new boolean[V + 1];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        System.out.print("Đường đi theo BFS: ");
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = a[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }
}
