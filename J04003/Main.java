//Created by Khanh Nguyen Van

package J04003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo p = new PhanSo(in.nextLong(), in.nextLong());
        p.rutGon();
        System.out.println(p);
    }
}
