//Created by Khanh Nguyen Van

package J04014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            PhanSo A = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo B = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo tmp = A.add(B);
            tmp.reDuce();
            PhanSo C = tmp.multiphy(tmp);
            C.reDuce();
            PhanSo D = (A.multiphy(B)).multiphy(C);
            D.reDuce();
            System.out.println(C + " " + D);
        }
    }
}
