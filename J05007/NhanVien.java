//Created by Khanh Nguyen Van

package J05007;

public class NhanVien implements Comparable<NhanVien> {
    private String maNhanVien, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKy;

    public NhanVien(int stt, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) {
        this.maNhanVien = String.format("%05d", stt);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
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

    public int compareTo(NhanVien n) {
        String s1[] = this.ngaySinh.split("/");
        String s2[] = n.ngaySinh.split("/");
        if (Integer.parseInt(s1[2]) > Integer.parseInt(s2[2])) return 1;
        else if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2]) &&
                Integer.parseInt(s1[1]) > Integer.parseInt(s2[1])) return 1;
        else if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2]) &&
                Integer.parseInt(s1[1]) == Integer.parseInt(s2[1]) &&
                Integer.parseInt(s1[0]) > Integer.parseInt(s2[0])) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return maNhanVien + " " + hoTen + " " + gioiTinh + " " + chuanHoa(ngaySinh) + " " + diaChi + " " + maSoThue
                + " " + ngayKy;
    }
}

