//Created by Khanh Nguyen Van

package J05006;

public class NhanVien {
    private String maNhanVien, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKy;

    public NhanVien(int stt, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.maNhanVien = String.format("%05d", stt);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoa(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = chuanHoa(ngayKy);
    }

    private String chuanHoa(String ngay) {
        String n[] = ngay.split("/");
        if (n[0].length() == 1) n[0] = "0" + n[0];
        if (n[1].length() == 1) n[1] = "0" + n[1];
        return n[0] + "/" + n[1] + "/" + n[2];
    }

    @Override
    public String toString() {
        return maNhanVien + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue
                + " " + ngayKy;
    }
}
