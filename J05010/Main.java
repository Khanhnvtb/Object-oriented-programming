//Created by Khanh Nguyen Van

package J05010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new MatHang(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine())));
        }
        Collections.sort(a);
        for (MatHang m : a)
            System.out.println(m);
    }
}
