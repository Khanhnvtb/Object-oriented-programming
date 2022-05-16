//Created by Khanh Nguyen Van

package J05060;

public class PhuHo {
    private String ma, hoTen, xepLoai;
    private int tuoi, diem;

    public PhuHo(int stt, String hoTen, String ngaySinh, double diemLT, double diemTH) {
        this.ma = "PH" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.tuoi = timTuoi(ngaySinh);
        this.diem = timDiem(diemLT, diemTH);
        this.xepLoai = timXepLoai(diem);
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
        return ma + " " + hoTen + " " + tuoi + " " + diem + " " + xepLoai;
    }
}
