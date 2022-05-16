//Created by Khanh Nguyen Van

package J05038;

public class NhanVien {
    private String ma, hoTen;
    private int luongThang, thuong, phuCap, thucLinh;

    public NhanVien(int stt, String hoTen, int luongNgay, int soNgayCong, String chucVu) {
        this.ma = "NV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.luongThang = luongNgay * soNgayCong;
        this.thuong = tinhThuong(soNgayCong);
        this.phuCap = tinhPhuCap(chucVu);
        this.thucLinh = luongThang + thuong + phuCap;
    }

    private int tinhThuong(int soNgayCong) {
        if (soNgayCong > 24) return luongThang / 5;
        else if (soNgayCong > 21) return luongThang / 10;
        return 0;
    }

    private int tinhPhuCap(String chucVu) {
        if (chucVu.equals("GD")) return 250000;
        else if (chucVu.equals("PGD")) return 200000;
        else if (chucVu.equals("TP")) return 180000;
        return 150000;
    }

    public int getThucLinh() {
        return thucLinh;
    }

    @Override
    public String toString() {
        return ma + " " + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thucLinh;
    }
}
