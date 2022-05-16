//Created by Khanh Nguyen Van

package J06006;

import java.util.*;

public class Main {
    static ArrayList<KhachHang> kh = new ArrayList<>();
    static ArrayList<MatHang> mh = new ArrayList<>();
    static ArrayList<HoaDon> hd = new ArrayList<>();

    public static KhachHang findKH(String khachHang) {
        String tmp = khachHang.charAt(2) + "" + khachHang.charAt(3) + "" + khachHang.charAt(4);
        int inDex = Integer.parseInt(tmp) - 1;
        return kh.get(inDex);
    }

    public static MatHang findMH(String matHang) {
        String tmp = matHang.charAt(2) + "" + matHang.charAt(3) + "" + matHang.charAt(4);
        int inDex = Integer.parseInt(tmp) - 1;
        return mh.get(inDex);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++)
            kh.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++)
            mh.add(new MatHang(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            hd.add(new HoaDon(i, findKH(in.next()), findMH(in.next()), (in.nextInt())));
            in.nextLine();
        }
        Collections.sort(hd);
        for (HoaDon h : hd)
            System.out.println(h);
    }
}
