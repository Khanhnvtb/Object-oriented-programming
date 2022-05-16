//Created by Khanh Nguyen Van

package J05040;

public class NhanVien {
    private String maNV, hoTen, chucVu;
    private long luongCoBan, soNgayCong, luongThang, thuong, phuCap, thuNhap;

    public NhanVien(int stt, String hoTen, long luongCoBan, long soNgayCong, String chucVu) {
        this.maNV = "NV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.luongThang = tinhLuong(luongCoBan, soNgayCong);
        this.thuong = tienThuong(soNgayCong, luongThang);
        this.phuCap = tinhPhuCap(chucVu);
        this.thuNhap = tinhThuNhap(luongThang, thuong, phuCap);
    }

    private long tinhLuong(long luongCoBan, long soNgayCong) {
        return luongCoBan * soNgayCong;
    }

    private long tienThuong(long soNgayCong, long luongThang) {
        if (soNgayCong > 24) return luongThang / 5;
        else if (soNgayCong > 21) return luongThang / 10;
        else return 0;
    }

    private long tinhPhuCap(String chucVu) {
        if (chucVu.compareTo("GD") == 0) return 250000;
        else if (chucVu.compareTo("PGD") == 0) return 200000;
        else if (chucVu.compareTo("TP") == 0) return 180000;
        return 150000;
    }

    private long tinhThuNhap(long luongThang, long thuong, long phuCap) {
        return luongThang + thuong + phuCap;
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}
