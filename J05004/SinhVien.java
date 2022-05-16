//Created by Khanh Nguyen Van

package J05004;

public class SinhVien {
    private String ma, hoTen, lop, ngaySinh;
    private float GPA;

    public SinhVien(int stt, String hoTen, String lop, String ngaySinh, float GPA) {
        this.ma = "B20DCCN" + String.format("%03d", stt);
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.GPA = GPA;
    }

    private String chuanHoaTen(String hoTen) {
        String s[] = hoTen.trim().split("\\s+");
        String tmp = "";
        for (int i = 0; i < s.length; i++) {
            tmp += s[i].substring(0, 1).toUpperCase();
            tmp += s[i].substring(1).toLowerCase();
            tmp += " ";
        }
        return tmp;
    }

    private String chuanHoaNgay(String ngaySinh) {
        String ns[] = ngaySinh.split("/");
        if (ns[0].length() == 1) ns[0] = "0" + ns[0];
        if (ns[1].length() == 1) ns[1] = "0" + ns[1];
        return ns[0] + "/" + ns[1] + "/" + ns[2];
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + lop + " " + ngaySinh + " " + String.format("%.2f", GPA);
    }
}
