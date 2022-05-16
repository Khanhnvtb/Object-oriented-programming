package J07054;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten;
    double diem;

    public SinhVien(int stt, String ten, double diem1, double diem2, double diem3) {
        this.ma = "SV" + String.format("%02d", stt);
        this.ten = chuanHoa(ten.trim());
        this.diem = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
    }

    private String chuanHoa(String ten) {
        String s[] = ten.split("\\s+");
        String ans = "";
        for (String str : s) {
            ans += str.toUpperCase().charAt(0);
            ans += str.toLowerCase().substring(1) + " ";
        }
        return ans;
    }

    public double getDiem() {
        return diem;
    }

    public int compareTo(SinhVien s) {
        if (this.diem <= s.diem) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.2f", diem);
    }
}
