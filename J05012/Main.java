//Created by Khanh Nguyen Van

package J05012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new MatHang(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Long.parseLong(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a);
        for (MatHang m : a)
            System.out.println(m);
    }
}
