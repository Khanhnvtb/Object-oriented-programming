//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01023 {
    static String s;
    static char tmp[] = new char[15];
    static int state = 0;

    public static boolean isOperator(char c) { //hàm kiểm tra toán tử
        if (c == '+' || c == '-') return true;
        return false;
    }

    public static int toInt(char x, char y) { //hàm chuyển đổi sang kiểu int
        int val = (x - 48) * 10 + (y - 48);
        return val;
    }

    public static boolean check(String str) { //hàm kiểm tra phép toán
        int a, b, c;
        a = toInt(str.charAt(0), str.charAt(1));
        b = toInt(str.charAt(5), str.charAt(6));
        c = toInt(str.charAt(10), str.charAt(11));
        if (str.charAt(3) == '+' && a + b == c) return true;
        if (str.charAt(3) == '-' && a - b == c) return true;
        return false;
    }

    public static void Try(int i) { //hàm quay lui
        if (state == 1) return; //nếu đã có kết quả thì dừng lại
        if (i == 0 || i == 5 || i == 10) { //chữ số đầu tiên của 1 số nằm trong khoảng từ 1 đến 9
            if (s.charAt(i) == '?') { //nếu là dấu ? thì tạo ta các trường hợp
                for (char j = '1'; j <= '9'; j++) {
                    tmp[i] = j;
                    Try(i + 1); //gọi hàm quay lui để duyệt đến phần tử kế tiếp
                }
            } else Try(i + 1); //gọi hàm quay lui để duyệt đến phần tử kế tiếp
        } else if (i == 1 || i == 6 || i == 11) { //chữ số thứ 2 của 1 số nằm trong khoảng từ 0 đến 9
            if (s.charAt(i) == '?') { //nếu là dấu ? thì tạo ta các trường hợp
                for (char j = '0'; j <= '9'; j++) {
                    tmp[i] = j;
                    if (i < 11) Try(i + 1); //gọi hàm quay lui để duyệt đến phần tử kế tiếp
                    else { //duyệt đến hết thì kiểm tra xem biểu thức có đúng không
                        String ans = "";
                        for (int k = 0; k < s.length(); k++) ans += tmp[k];
                        if (check(ans)) {
                            System.out.print(ans);
                            state = 1;
                            return;
                        }
                    }
                }
            } else {
                if (i < 11) Try(i + 1);
                else { //duyệt đến hết thì kiểm tra xem biểu thức có đúng không
                    String ans = "";
                    for (int k = 0; k < s.length(); k++) ans += tmp[k];
                    if (check(ans)) {
                        System.out.print(ans);
                        state = 1;
                        return;
                    }
                }
            }
        } else if (i == 3) {
            if (isOperator(s.charAt(i))) Try(i + 1); //nếu là toán tử thì gọi hàm quay lui để duyệt đến phần tử kế tiếp
            else { //nếu là dấu ? thì thử với 2 trường hợp + và -
                tmp[i] = '+';
                Try(i + 1);
                tmp[i] = '-';
                Try(i + 1);
            }
        } else Try(i + 1); //nếu là khoảng trắng thì gọi hàm quay lui để duyệt đến phần tử kế tiếp
    }

    public static void solve() {
        state = 0; //khởi tạo tráng thái
        if (s.charAt(3) == '/' || s.charAt(3) == '*') return; //nếu có dấu * hoặc / thì không tồn tại phép toán đúng
        if (s.charAt(0) == '0' || s.charAt(5) == '0' || s.charAt(10) == '0')
            return; //nếu không phải số có 2 chữ số thì cũng sai
        if (check(s)) { //thực hiện kiểm tra biểu thức đầu vào xem có đúng không
            state = 1;
            System.out.print(s);
            return;
        }
        for (int i = 0; i < s.length(); i++) tmp[i] = s.charAt(i);
        Try(0); //thực hiện quay lui
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            s = in.nextLine();
            solve();
            if (state == 0) System.out.print("WRONG PROBLEM!");
            System.out.println();
        }
    }
}
