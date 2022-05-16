package J05079;

public class HocPhan implements Comparable<HocPhan> {
    private String ten, nhom, giangVien;

    public HocPhan(String ten, String nhom, String giangVien) {
        this.ten = ten;
        this.nhom = nhom;
        this.giangVien = giangVien;
    }

    public String getTen() {
        return "Danh sach nhom lop mon " + ten + ":";
    }

    public int compareTo(HocPhan h) {
        if (Integer.parseInt(this.nhom) > Integer.parseInt(h.nhom)) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return nhom + " " + giangVien;
    }
}
