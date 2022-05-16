package J07057;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ma, ten;
    private double diem;
    private String trangThai;

    public ThiSinh(int stt, String ten, double diem, String danToc, int khuVuc) {
        this.ma = "TS" + String.format("%02d", stt);
        this.ten = chuanHoa(ten.trim());
        this.diem = tinhDiem(diem, danToc, khuVuc);
        this.trangThai = timTrangThai(this.diem);
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

    private double tinhDiem(double diem, String danToc, int khuVuc) {
        if (khuVuc == 1) {
            diem += 1.5;
            if (danToc.equals("Kinh")) return diem;
            return diem + 1.5;
        } else if (khuVuc == 2) {
            diem += 1;
            if (danToc.equals("Kinh")) return diem;
            return diem + 1.5;
        } else {
            if (danToc.equals("Kinh")) return diem;
            return diem + 1.5;
        }
    }

    private String timTrangThai(double diem) {
        if (diem >= 20.5) return "Do";
        return "Truot";
    }

    public int compareTo(ThiSinh t) {
        if (this.diem <= t.diem) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + String.format("%.1f", diem) + " " + trangThai;
    }
}
