import java.util.*;

public class CayBieuThuc {
    static int n;
    static Stack<Character> s = new Stack<>(); //ngăn xếp chưa toán tử
    static Deque<Integer> q = new LinkedList<>(); //hàng đợi chưa toán hạng
    static Deque<String> dq = new LinkedList<>(); //hàng đợi chưa biểu thức số học

    static int calculate(int x, int y, char c) { //hàm tính biểu thức
        if (c == '+') return x + y;
        if (c == '-') return x - y;
        if (c == '*') return x * y;
        return x / y;
    }

    static void solve() {
        while (!s.isEmpty()) { //duyệt đến khi hết toán tử
            int y = q.pollLast(); //lấy ra 2 toán hạng ở cuối hàng đợi
            int x = q.pollLast();
            String s2 = dq.pollLast();
            String s1 = dq.pollLast();
            char c = s.peek();
            q.addFirst(calculate(x, y, c)); //thực hiện phép toán với toán tử tương ứng rồi thêm vào đầu hàng đợi
            dq.addFirst(s1 + " " + c + " " + s2); //cập nhật biểu thức
            s.pop();
        }
        System.out.println(dq.pollLast() + " = " + q.pollLast());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String ope[] = in.nextLine().split(" ");
        for (String i : ope)
            s.push(i.charAt(0));
        for (int i = n / 2; i < n; i++) {
            int x = in.nextInt();
            q.addLast(x); //đưa toán hạng vào hàng đợi
            dq.addLast("" + x);
        }
        solve();
    }
}
