//Created by Khanh Nguyen Van

package J05003;

public class SinhVien {
    private String ma, hoTen, lop, ngaySinh;
    private float GPA;

    public SinhVien(int stt, String hoTen, String lop, String ngaySinh, float GPA) {
        this.ma = "B20DCCN" + String.format("%03d", stt);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = chuanHoa(ngaySinh);
        this.GPA = GPA;
    }

    private String chuanHoa(String ngaySinh) {
        String ns[] = ngaySinh.split("/");
        if (ns[0].length() == 1) ns[0] = "0" + ns[0];
        if (ns[1].length() == 1) ns[1] = "0" + ns[1];
        return ns[0] + "/" + ns[1] + "/" + ns[2];
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", GPA);
    }
}
