package J07055;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, xepLoai;
    double diem;

    public SinhVien(int stt, String ten, double diem1, double diem2, double diem3) {
        this.ma = "SV" + String.format("%02d", stt);
        this.ten = chuanHoa(ten.trim());
        this.diem = diem1 * 0.25 + diem2 * 0.35 + diem3 * 0.4;
        this.xepLoai = tinhXepLoai(diem);
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

    private String tinhXepLoai(double diem) {
        if (diem >= 8) return "GIOI";
        else if (diem >= 6.5) return "KHA";
        else if (diem >= 5) return "TRUNG BINH";
        return "KEM";
    }

    public int compareTo(SinhVien s) {
        if (this.diem < s.diem) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.2f", diem) + " " + xepLoai;
    }
}

