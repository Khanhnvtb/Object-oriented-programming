//Created by Khanh Nguyen Van

package J06001;

public class SanPham {
    private String ma, ten;
    private long gia;

    public SanPham(String ma, String loai, String ten, long gia) {
        this.ma = ma + loai;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public long getGia() {
        return gia;
    }

    public String getTen() {
        return ten;
    }
}
