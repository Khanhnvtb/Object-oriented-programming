//Created by Khanh Nguyen Van

package J05033;

public class ThoiGian implements Comparable<ThoiGian> {
    int hour, minute, second;

    public ThoiGian(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int compareTo(ThoiGian t) {
        if (this.hour > t.hour) return 1;
        else if (this.hour == t.hour && this.minute > t.minute) return 1;
        else if (this.hour == t.hour && this.minute == t.minute && this.second > t.second) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
}
