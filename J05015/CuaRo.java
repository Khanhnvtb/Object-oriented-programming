//Created by Khanh Nguyen Van

package J05015;

public class CuaRo implements Comparable<CuaRo> {
    private String ma, hoTen, donVi;
    private double vanToc;

    public CuaRo(String hoTen, String donVi, String thoiGianDenDich) {
        this.ma = timMA(donVi, hoTen);
        this.hoTen = hoTen;
        this.donVi = donVi;
        this.vanToc = timVanToc(thoiGianDenDich);
    }

    private String timMA(String donVi, String hoTen) {
        String s1[] = donVi.split(" ");
        String s2[] = hoTen.split(" ");
        String tmp = "";
        for (int i = 0; i < s1.length; i++) tmp += s1[i].charAt(0);
        for (int i = 0; i < s2.length; i++) tmp += s2[i].charAt(0);
        return tmp;
    }

    private double timVanToc(String thoiGianDenDich) {
        String s[] = thoiGianDenDich.split(":");
        int gio = Integer.parseInt(s[0]) - 6;
        int phut = Integer.parseInt(s[1]);
        return 120 / (gio + (double) phut / 60);
    }

    public int compareTo(CuaRo c) {
        if (this.vanToc < c.vanToc) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + donVi + " " + Math.round(vanToc) + " Km/h";
    }
}
