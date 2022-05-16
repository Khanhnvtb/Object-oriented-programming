package J07071;

public class Ten implements Comparable<Ten>{
    private String ten, vietTat;

    public Ten(String ten) {
        this.ten = ten;
        this.vietTat = chuaHoa(ten);
    }

    public String getVietTat() {
        return vietTat;
    }

    private String chuaHoa(String ten) {
        String s[] = ten.split(" ");
        String ans = "";
        for (String i : s)
            ans += i.toUpperCase().charAt(0) + ".";
        return ans.substring(0, ans.length() - 1);
    }

    public int compareTo(Ten t) {
        String s1[] = this.ten.split(" ");
        String s2[] = t.ten.split(" ");
        if (s1[2].compareTo(s2[2]) > 0) return 1;
        else if (s1[2].compareTo(s2[2]) == 0 && s1[0].compareTo(s2[0]) > 0) return 1;
        else if (s1[2].compareTo(s2[2]) == 0 && s1[0].compareTo(s2[0]) == 0 && s1[1].compareTo(s2[1]) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ten;
    }
}
