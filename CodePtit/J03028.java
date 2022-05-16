//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03028 {
    static ArrayList<Character> a = new ArrayList<>();

    public static String enCode(String s) {
        String sl = "", sr = "";
        for (int i = 0; i < s.length() / 2; i++) sl += s.charAt(i);
        for (int i = s.length() / 2; i < s.length(); i++) sr += s.charAt(i);
        int valueRotateLeft = 0, valueRotateRight = 0;
        for (int i = 0; i < sl.length(); i++) valueRotateLeft += sl.charAt(i) - 65;
        for (int i = 0; i < sr.length(); i++) valueRotateRight += sr.charAt(i) - 65;
        String tmp = "";
        for (int i = 0; i < sl.length(); i++)
            if (sl.charAt(i) + valueRotateLeft > 90) tmp += a.get(((sl.charAt(i) + valueRotateLeft) - 91) % 26);
            else tmp += a.get(sl.charAt(i) + valueRotateLeft - 65);
        sl = tmp;
        tmp = "";
        for (int i = 0; i < sr.length(); i++)
            if (sr.charAt(i) + valueRotateRight > 90) tmp += a.get(((sr.charAt(i) + valueRotateRight) - 91) % 26);
            else tmp += a.get(sr.charAt(i) + valueRotateRight - 65);
        sr = tmp;
        tmp = "";
        for (int i = 0; i < sl.length(); i++) {
            int value = sr.charAt(i) - 65;
            if (sl.charAt(i) + value > 90) tmp += a.get(((sl.charAt(i) + value) - 91) % 26);
            else tmp += a.get(sl.charAt(i) + value - 65);
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            for (char c = 'A'; c <= 'Z'; c++)
                a.add(c);
            System.out.println(enCode(s));
        }
    }
}
