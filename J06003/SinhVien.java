//Created by Khanh Nguyen Van

package J06003;

public class SinhVien {
    private String ma, hoTen, sdt;

    public SinhVien(String ma, String hoTen, String sdt) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + sdt + "\n";
    }
}
