//Created by Khanh Nguyen Van

package J05025;

public class GiangVien implements Comparable<GiangVien> {
    private String ma, hoTen, boMon;

    public GiangVien(int stt, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.boMon = chuanHoa(boMon);
    }

    public String chuanHoa(String boMon) {
        String s[] = boMon.split(" ");
        String ans = "";
        for (String tmp : s) {
            ans += tmp.toUpperCase().charAt(0);
        }
        return ans;
    }

    public int compareTo(GiangVien g) {
        String s1[] = this.hoTen.split(" ");
        String s2[] = g.hoTen.split(" ");
        if (s1[s1.length - 1].compareTo(s2[s2.length - 1]) >= 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + boMon;
    }
}
