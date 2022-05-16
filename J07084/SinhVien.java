package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private Long thoiGian;

    public SinhVien(String ten, String in, String out) throws ParseException {
        this.ten = ten;
        Date login = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(in);
        Date logout = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(out);
        this.thoiGian = (logout.getTime() - login.getTime()) / 60000;
    }

    public int compareTo(SinhVien s) {
        int t = this.thoiGian.compareTo(s.thoiGian);
        if (t == 0) return this.ten.compareTo(s.ten);
        else return -t;
    }

    @Override
    public String toString() {
        return ten + " " +
                thoiGian;
    }
}
