//Created by Khanh Nguyen Van

package J05023;

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
            String khoa = in.nextLine();
            int inDex = 0;
            for (int i = inDex; i < a.size(); i++) {
                if (a.get(i).getLop().charAt(2) == khoa.charAt(3)) {
                    System.out.println("DANH SACH SINH VIEN KHOA 201" + khoa.charAt(3) + ":");
                    for (int j = inDex; j < a.size(); j++) {
                        if (a.get(j).getLop().charAt(2) == khoa.charAt(3))
                            System.out.println(a.get(j));
                    }
                    break;
                }
            }
        }
    }
}
