package J07082;

public class SinhVien {
    private String ma, ten, sdt, email;

    public SinhVien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma + " " +
                ten + " " +
                sdt + " " +
                email;
    }
}
