package J07083;

public class SinhVien {
    private String ma, ten, sdt, email;

    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public int compareTo(SinhVien sv) {
        return this.ma.compareTo(sv.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten;
    }
}
