//Created by Khanh Nguyen Van

package J05032;

public class Nguoi implements Comparable<Nguoi> {
    private String ten, ngaySinh;

    public Nguoi(String s) {
        String str[] = s.split(" ");
        this.ten = str[0];
        this.ngaySinh = str[1];
    }

    public int compareTo(Nguoi n) {
        String s1[] = this.ngaySinh.split("/");
        String s2[] = n.ngaySinh.split("/");
        if (Integer.parseInt(s2[2]) < Integer.parseInt(s1[2])) return 1;
        else if (Integer.parseInt(s2[2]) == Integer.parseInt(s1[2]) &&
                Integer.parseInt(s2[1]) < Integer.parseInt(s1[1])) return 1;
        else if (Integer.parseInt(s2[2]) == Integer.parseInt(s1[2]) &&
                Integer.parseInt(s2[1]) == Integer.parseInt(s1[1]) &&
                Integer.parseInt(s2[0]) < Integer.parseInt(s1[0])) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ten;
    }
}