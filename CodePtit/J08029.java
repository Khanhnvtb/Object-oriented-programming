//Created by Khanhnvtb

package CodePtit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08029 {
    static int dx[] = {-2, -2, -1, -1, 1, 1, 2, 2}; //mảng tạo độ x của quân mã
    static int dy[] = {-1, 1, -2, 2, -2, 2, -1, 1}; //mảng toạ độ y của quân mã

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static boolean check(int i, int j) { //hàm kiểm tra toạ độ của quân mã có nằm trên bàn cờ không
        if (i < 1 || i > 8 || j < 1 || j > 8) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            int start_row, start_col, dest_row, dest_col;
            start_col = s.charAt(0) - 96; //chuyển định dạng sang toạ độ kiểu số
            start_row = s.charAt(1) - 48;
            dest_col = s.charAt(3) - 96;
            dest_row = s.charAt(4) - 48;
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(start_row, start_col)); //đẩy toạ độ bắt đầu của quân mã vào hàng đợi
            int vs[][] = new int[9][9];
            vs[start_row][start_col] = 1; //đánh dẫu đã đi qua
            while (!q.isEmpty()) {
                int i = q.peek().first;
                int j = q.peek().second;
                q.poll();
                for (int k = 0; k < 8; k++) { //thử với tất cả các hướng của quân mã
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (check(x, y) && vs[x][y] == 0) { //nếu có 1 vị trí chưa được đi
                        vs[x][y] = vs[i][j] + 1; //đánh dấu mất số bước để đi tới
                        q.add(new Pair(x, y)); //đẩy nó vào hàng đợi
                    }
                }
                if (vs[dest_row][dest_col] != 0) { //nếu đã đến đích
                    System.out.println(vs[dest_row][dest_col] - 1);
                    break;
                }
            }
        }
    }
}
