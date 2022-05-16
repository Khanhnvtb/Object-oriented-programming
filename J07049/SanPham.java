//Created by Khanhnvtb

package J07049;

public class SanPham{
    private String ma, ten;
    private int gia, baoHanh;

    public SanPham(String ma, String ten, int gia, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }

    public int getBaoHanh() {
        return baoHanh;
    }

}

