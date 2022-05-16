//Created by Khanh Nguyen Van

package J05036;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Hang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Hang(i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()),
                    Long.parseLong(in.nextLine())));
        }
        for (Hang h : a)
            System.out.println(h);
    }
}
