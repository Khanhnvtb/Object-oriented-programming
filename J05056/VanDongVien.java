//Created by Khanh Nguyen Van

package J05056;

public class VanDongVien implements Comparable<VanDongVien> {

    private String ma, hoTen;
    private ThoiGian thanhTichThucTe, uuTien, thanhTichXepHang;

    public VanDongVien(int stt, String hoTen, String ngaySinh, String timeIn, String timeOut) {
        this.ma = "VDV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.thanhTichThucTe = timThoiGian(timeIn, timeOut);
        this.uuTien = timUutien(ngaySinh);
        this.thanhTichXepHang = uuTien.truThoiGian(thanhTichThucTe);
    }

    public ThoiGian getThanhTichXepHang() {
        return thanhTichXepHang;
    }

    private ThoiGian timThoiGian(String timeIn, String timeOut) {
        String s1[] = timeIn.split(":");
        String s2[] = timeOut.split(":");
        ThoiGian t1 = new ThoiGian(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
        ThoiGian t2 = new ThoiGian(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2]));
        return t1.truThoiGian(t2);
    }

    private ThoiGian timUutien(String ngaySinh) {
        String s[] = ngaySinh.split("/");
        int t = 2021 - Integer.parseInt(s[2]);
        if (t < 18) return new ThoiGian(0, 0, 0);
        else if (t < 25) return new ThoiGian(0, 0, 1);
        else if (t < 32) return new ThoiGian(0, 0, 2);
        return new ThoiGian(0, 0, 3);
    }

    public int compareTo(VanDongVien v) {
        if (this.thanhTichXepHang.compareTo(v.thanhTichXepHang) >= 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + thanhTichThucTe + " " + uuTien + " " + thanhTichXepHang + " ";
    }
}
