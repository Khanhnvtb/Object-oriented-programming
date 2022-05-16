package J07072;

public class Ten implements Comparable<Ten> {
    private String ten;

    public Ten(String ten) {
        this.ten = chuaHoa(ten.trim());
    }

    private String chuaHoa(String ten) {
        String str[] = ten.toLowerCase().split("\\s+");
        String ans = "";
        for (String s : str)
            ans += s.toUpperCase().charAt(0) + s.substring(1) + " ";
        return ans.substring(0, ans.length() - 1);
    }

    public String convert(String ten) {
        String s[] = ten.split(" ");
        String ans = s[s.length - 1];
        for (int i = 0; i < s.length - 1; i++)
            ans += " " + s[i];
        return ans;
    }

    public int compareTo(Ten t) {
        return convert(this.ten).compareTo(convert(t.ten));
    }

    @Override
    public String toString() {
        return ten;
    }
}
