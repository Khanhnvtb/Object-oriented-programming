//Created by Khanh Nguyen Van

package J05026;

import java.util.*;

public class Main {
    public static String chuanHoa(String boMon) {
        String s[] = boMon.split(" ");
        String ans = "";
        for (String tmp : s) {
            ans += tmp.toUpperCase().charAt(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new GiangVien(i, in.nextLine(), chuanHoa(in.nextLine())));
        }
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            String boMon = chuanHoa(in.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON " + boMon + ":");
            for (GiangVien g : a) {
                if (g.getBoMon().equals(boMon))
                    System.out.println(g);
            }
        }
    }
}
