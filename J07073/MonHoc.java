package J07073;

public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, tinChi, lyThuyet, thucHanh;

    public MonHoc(String ma, String ten, String tinChi, String lyThuyet, String thucHanh) {
        this.ma = ma;
        this.ten = ten;
        this.tinChi = tinChi;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public String getThucHanh() {
        return thucHanh;
    }

    public int compareTo(MonHoc m) {
        return this.ma.compareTo(m.ma);
    }

    @Override
    public String toString() {
        return ma + " " +
                ten + " " +
                tinChi + " " +
                lyThuyet + " " +
                thucHanh;
    }
}
