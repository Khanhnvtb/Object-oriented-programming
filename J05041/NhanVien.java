//Created by Khanh Nguyen Van

package J05041;

public class NhanVien implements Comparable<NhanVien>{
    private String maNV, hoTen, chucVu;
    private long luongCoBan, soNgayCong;

    public NhanVien(int stt, String hoTen, long luongCoBan, long soNgayCong, String chucVu) {
        this.maNV = "NV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    private long tinhLuong() {
        return this.luongCoBan * this.soNgayCong;
    }

    private long tienThuong() {
        if (this.soNgayCong > 24) return tinhLuong() / 5;
        else if (this.soNgayCong > 21) return tinhLuong() / 10;
        else return 0;
    }

    private long tinhPhuCap() {
        if (this.chucVu.compareTo("GD") == 0) return 250000;
        else if (this.chucVu.compareTo("PGD") == 0) return 200000;
        else if (this.chucVu.compareTo("TP") == 0) return 180000;
        return 150000;
    }

    private long tinhThuNhap() {
        return tinhLuong() + tienThuong() + tinhPhuCap();
    }

    public int compareTo(NhanVien p) {
        if (this.tinhThuNhap() < p.tinhThuNhap()) return 1;
        else if (this.tinhThuNhap() > p.tinhThuNhap()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + tinhLuong() + " " + tienThuong() + " " + tinhPhuCap() + " " + tinhThuNhap();
    }
}
