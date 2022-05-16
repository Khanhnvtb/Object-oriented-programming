package CodePtit;

import java.util.*;

public class J08026 {
    static class Pair {
        int S, cnt;

        public Pair(int s, int cnt) {
            S = s;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int S = in.nextInt(), T = in.nextInt();
            Set<Integer> s = new HashSet<>(); //khai báo 1 set (tập hợp lưu trữ các phần tử không trùng lặp)
            Queue<Pair> q = new LinkedList<>(); //khai báo hàng đợi với .first là giá trị và .second là số lần biến đổi
            q.add(new Pair(S, 0));
            while (!q.isEmpty()) {
                int val = q.peek().S;
                int cnt = q.peek().cnt;
                if (val - 1 == T || val * 2 == T) {
                    System.out.println(cnt + 1); //nếu tìm được T trả về kết quả
                    break;
                }
                if (!s.contains(val * 2) && val < T) { //nếu không tìm được T và số mới chưa được thăm thì thêm vào
                    q.add(new Pair(val * 2, cnt + 1));
                    s.add(val * 2);
                }
                if (!s.contains(val - 1) && val > 1) {  //nếu không tìm được T và số mới chưa được thăm thì thêm vào
                    q.add(new Pair(val - 1, cnt + 1));
                    s.add(val - 1);
                }
                q.poll(); //xoá số đã thăm khỏi hàng đợi
            }
        }
    }
}
