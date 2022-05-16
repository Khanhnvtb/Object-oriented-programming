//Created by Khanh Nguyen Van

package J05042;

public class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private int cauDung, luotSub;

    public SinhVien(String hoTen, String s) {
        String str[] = s.split(" ");
        this.hoTen = hoTen;
        this.cauDung = Integer.parseInt(str[0]);
        this.luotSub = Integer.parseInt(str[1]);
    }

    public int compareTo(SinhVien s) {
        if (this.cauDung < s.cauDung) return 1;
        else if (this.cauDung == s.cauDung && this.luotSub > s.luotSub) return 1;
        else if (this.cauDung == s.cauDung && this.luotSub == s.luotSub &&
                this.hoTen.compareTo(s.hoTen) >= 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return hoTen + " " + " " + cauDung + " " + luotSub;
    }
}
