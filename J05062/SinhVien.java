//Created by Khanh Nguyen Van

package J05062;

public class SinhVien {
    private String ten, xepLoai;
    private double gpa;

    public SinhVien(String ten, String s) {
        this.ten = ten;
        String str[] = s.split(" ");
        double gpa = Double.parseDouble(str[0]);
        int RL = Integer.parseInt(str[1]);
        this.gpa = gpa;
        this.xepLoai = timXepLoai(gpa, RL);
    }
    public double getGpa() {
        return gpa;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    private String timXepLoai(double gpa, int RL) {
        if (gpa >= 3.6 && RL >= 90) return "XUATSAC";
        else if (gpa >= 3.2 && RL >= 80) return "GIOI";
        else if (gpa >= 2.5 && RL >= 70) return "KHA";
        return "KHONG";
    }

    @Override
    public String toString() {
        return ten + ": ";
    }
}
