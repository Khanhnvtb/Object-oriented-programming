//Created by Khanh Nguyen Van

package J04004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo a = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo b = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo s = PhanSo.sumOfPhanSo(a, b);
        s.reDuce();
        System.out.println(s);
    }
}
