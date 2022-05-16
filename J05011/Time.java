//Created by Khanh Nguyen Van

package J05011;

public class Time implements Comparable<Time> {
    private String code, name, timeIn, timeOut, timePlay;

    public Time(String code, String name, String timeIn, String timeOut) {
        this.code = code;
        this.name = name;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.timePlay = countTime(timeIn, timeOut);
    }

    private String countTime(String timeIn, String timeOut) {
        String s1[] = timeIn.split(":");
        String s2[] = timeOut.split(":");
        int h = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
        if (m < 0) {
            m += 60;
            h--;
        }
        return h + " gio " + m + " phut";
    }

    public int compareTo(Time t) {
        String s1[] = this.timePlay.split(" ");
        String s2[] = t.timePlay.split(" ");
        if (Integer.parseInt(s1[0]) < Integer.parseInt(s2[0])) return 1;
        else if (Integer.parseInt(s1[0]) == Integer.parseInt(s2[0]) &&
                Integer.parseInt(s1[2]) < Integer.parseInt(s2[2])) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + timePlay;
    }
}
