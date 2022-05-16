//Created by Khanh Nguyen Van

package J05076;

import java.util.*;

public class MatHang {
    private String ma, ten;
    private int nhap, xuat;

    public MatHang(String ma, String ten, int nhap, int xuat, char loai) {
        this.ma = ma;
        this.ten = ten;
        this.nhap = nhap;
        this.xuat = tinhXuat(xuat, loai);
    }

    private int tinhXuat(int xuat, char loai) {
        if (loai == 'A') return xuat / 100 * 108;
        else if (loai == 'B') return xuat + xuat / 20;
        return xuat + xuat / 50;
    }

    @Override
    public String toString() {
        return ma + " " + " " + ten + " " + nhap + " " + xuat;
    }

}
