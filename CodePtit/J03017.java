//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03017 {
    static class Pair {
        char first;
        int second;

        Pair(char first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static int longestNull(String s) {
        ArrayList<Pair> a = new ArrayList<>();
        a.add(new Pair('@', -1));
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            a.add(new Pair(s.charAt(i), i));
            while (a.size() >= 3 && a.get(a.size() - 3).first == '1' && a.get(a.size() - 2).first == '0' && a.get(a.size() - 1).first == '0') {
                a.remove(a.size() - 3);
                a.remove(a.size() - 2);
                a.remove(a.size() - 1);
            }
            int tmp = a.get(a.size() - 1).second;
            max = Math.max(max, i - tmp);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            System.out.println(longestNull(s));
        }
    }
}
