package J07053;

public class ThiSinh {
    private String ma, hoTen, xepLoai;
    private int tuoi, diem;

    public ThiSinh(int stt, String hoTen, String ngaySinh, double diemLT, double diemTH) {
        this.ma = "PH" + String.format("%02d", stt);
        this.hoTen = chuanHoa(hoTen.trim());
        this.tuoi = timTuoi(ngaySinh);
        this.diem = timDiem(diemLT, diemTH);
        this.xepLoai = timXepLoai(diem);
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

    private int timDiem(double diemLT, double diemTH) {
        double thuong = 0;
        if (diemLT >= 8.0 && diemTH >= 8.0) thuong = 1.0;
        else if (diemLT >= 7.5 && diemTH >= 7.5) thuong = 0.5;
        double diem = (diemLT + diemTH) / 2 + thuong;
        if (diem >= 10.0) return 10;
        return (int) (diem + 0.5);
    }

    private int timTuoi(String ngaySinh) {
        String s[] = ngaySinh.split("/");
        return 2021 - Integer.parseInt(s[2]);
    }

    private String timXepLoai(int diem) {
        if (diem >= 9) return "Xuat sac";
        else if (diem == 8) return "Gioi";
        else if (diem == 7) return "Kha";
        else if (diem >= 5) return "Trung binh";
        return "Truot";
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + tuoi + " " + diem + " " + xepLoai;
    }
}
