//Created by Khanh Nguyen Van

package J05078;

import java.util.*;

public class NhanVien {
    private String ma, ten, phongBan;
    private long luongThang;

    public NhanVien(String ma, String ten, String phongBan, int luongCoBan, int soNgayCong, char loai, int nam) {
        this.ma = ma;
        this.ten = ten;
        this.phongBan = phongBan;
        this.luongThang = tinhLuong(luongCoBan, soNgayCong, loai, nam) * 1000;
    }

    public String getPhongBan() {
        return phongBan;
    }

    private long tinhLuong(int luongCoBan, int soNgayCong, char c, int nam) {
        long tien = luongCoBan * soNgayCong;
        if (c == 'A') {
            if (nam < 4) return tien * 10;
            else if (nam < 9) return tien * 12;
            else if (nam < 16) return tien * 14;
            else return tien * 20;
        } else if (c == 'B') {
            if (nam < 4) return tien * 10;
            else if (nam < 9) return tien * 11;
            else if (nam < 16) return tien * 13;
            else return tien * 16;
        } else if (c == 'C') {
            if (nam < 4) return tien * 9;
            else if (nam < 9) return tien * 10;
            else if (nam < 16) return tien * 12;
            else return tien * 14;
        } else {
            if (nam < 4) return tien * 8;
            else if (nam < 9) return tien * 9;
            else if (nam < 16) return tien * 11;
            else return tien * 13;
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang;
    }

}
