package CodePtit;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class J08025 {
    static class Pair {
        String s;
        int cnt;

        public Pair(String s, int cnt) {
            this.s = s;
            this.cnt = cnt;
        }
    }

    static int bfs(String s1, String s2) {
        if (s1.compareTo(s2) == 0) return 0; //nếu giống nhau trả về 0
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(s1, 0)); //thêm cấu hình đầu vào hàng đợi
        while (true) {
            s1 = q.peek().s; //lấy ra cấu hình hiện tại
            int cnt = q.peek().cnt + 1; //tăng số phép biến đổi
            q.poll();
            String tmp = "";
            tmp += s1.charAt(3);
            tmp += s1.charAt(0);
            tmp += s1.charAt(2);
            tmp += s1.charAt(4);
            tmp += s1.charAt(1);
            tmp += s1.charAt(5);
            if (tmp.equals(s2)) return cnt; //nếu đến đích trả về kết quả
            else q.add(new Pair(tmp, cnt)); //nếu chưa đến đích thêm cấu hình tiếp theo vào hàng đợi
            tmp = "";
            tmp += s1.charAt(0);
            tmp += s1.charAt(4);
            tmp += s1.charAt(1);
            tmp += s1.charAt(3);
            tmp += s1.charAt(5);
            tmp += s1.charAt(2);
            if (tmp.equals(s2)) return cnt;  //nếu đến đích trả về kết quả
            else q.add(new Pair(tmp, cnt)); //nếu chưa đến đích thêm cấu hình tiếp theo vào hàng đợi
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s1 = "", s2 = "";
            for (int i = 0; i < 6; i++) {
                char x = (char) in.nextInt();
                s1 += x;
            }
            for (int i = 0; i < 6; i++) {
                char x = (char) in.nextInt();
                s2 += x;
            }
            System.out.println(bfs(s1, s2));
        }
    }
}
