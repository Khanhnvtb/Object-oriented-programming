//Created by Khanh Nguyen Van

package J06005;

public class KhachHang {
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public KhachHang(int stt, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = "KH" + String.format("%03d", stt);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return tenKH + " " + diaChi + " ";
    }
}
