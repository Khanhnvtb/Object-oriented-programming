//Created by Khanh Nguyen Van

package J05027;

import java.util.*;

public class Main {
    public static boolean find(String s, String word) {
        for (int i = 0; i <= s.length() - word.length(); i++) {
            if (s.substring(i, i + word.length()).compareTo(word) == 0) return true;
        }
        return false;
    }

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
            String word = in.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + word + ":");
            for (GiangVien g : a) {
                if (find(g.getHoTen().toLowerCase(), word.toLowerCase()))
                    System.out.println(g);
            }
        }
    }
}
