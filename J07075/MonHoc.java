package J07075;

public class MonHoc {
    private String ma, ten, tin;

    public MonHoc(String ma, String ten, String tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ten;
    }
}
