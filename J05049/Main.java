//Created by Khanh Nguyen Van

package J05049;

import java.util.*;

public class Main {
    static char find(String s) {
        if (s.equals("A")) return 'A';
        return 'B';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Hang> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new Hang(in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        char c = find(in.nextLine());
        Collections.sort(a);
        for (Hang h : a)
            if (h.getMa().charAt(0) == c)
                System.out.println(h);
    }
}
