//Created by Khanh Nguyen Van

package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        in.nextLine();
        while (n-- > 0) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        String deTai[] = new String[m + 1];
        for (int i = 1; i <= m; i++) {
            deTai[i] = in.nextLine();
        }
        Collections.sort(a);
        for (SinhVien s : a)
            System.out.println(s + " " + deTai[s.getSoNhom()]);
    }
}
