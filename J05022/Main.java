//Created by Khanh Nguyen Van

package J05022;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            SinhVien s = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            a.add(s);
        }
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            String lop = in.nextLine();
            int inDex = 0;
            for (int i = inDex; i < a.size(); i++) {
                if (a.get(i).getLop().equals(lop)) {
                    System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
                    for (int j = inDex; j < a.size(); j++) {
                        if (a.get(j).getLop().compareTo(lop) == 0)
                            System.out.println(a.get(j));
                    }
                    break;
                }
            }
        }
    }
}
