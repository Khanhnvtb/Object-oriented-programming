//Created by Khanh Nguyen Van

package J05074;

import java.util.*;

public class SinhVien {
    private String ma, ten, lop, ghiChu;
    private int diem;

    public SinhVien(String ma, String ten, String lop, int diem) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void tinhDiem(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='m') this.diem-=1;
            else if(s.charAt(i)=='v') this.diem-=2;
        }
        if(this.diem<0) this.diem=0;
    }

    @Override
    public String toString() {
        String ans = ma + " " + ten + " " + lop + " " + " " + diem;
        if(diem==0) ans +=" KDDK";
        return ans;
    }
}
