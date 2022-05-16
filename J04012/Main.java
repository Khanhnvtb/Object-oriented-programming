//Created by Khanh Nguyen Van

package J04012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien n = new NhanVien(in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()),
                in.nextLine());
        System.out.println(n);
    }
}
