//Created by Khanh Nguyen Van

package J05064;

public class GiaoVien {
    private String ma, ten;
    private int bac, phuCap, thuNhap;

    public GiaoVien(String ma, String ten, int luongCoBan) {
        this.ma = ma;
        this.ten = ten;
        this.bac = tinhBac(ma);
        this.phuCap = tinhPhuCap(ma.charAt(1));
        this.thuNhap = luongCoBan * bac + phuCap;
    }

    private int tinhBac(String ma) {
        String tmp = ma.charAt(2) + "" + ma.charAt(3);
        return Integer.parseInt(tmp);
    }

    private int tinhPhuCap(char c) {
        if (c == 'T') return 2000000;
        else if (c == 'P') return 900000;
        return 500000;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bac + " " + phuCap + " " + thuNhap;
    }
}

