package J07018;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SinhVien {
    private String ma, ten, lop;
    private Date ngaySinh;
    private double GPA;

    public SinhVien(int stt, String ten, String lop, String ngaySinh, double GPA) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", stt);
        this.ten = chuanHoa(ten.trim());
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.GPA = GPA;
    }

    private String chuanHoa(String ten) {
        String s[] = ten.toLowerCase().split("\\s+");
        String ans = "";
        for (String str : s) ans += str.toUpperCase().substring(0, 1) + str.substring(1) + " ";
        return ans;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)
                + " " + String.format("%.2f", GPA);
    }
}

