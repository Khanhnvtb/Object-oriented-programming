//Created by Khanh Nguyen Van

package J05048;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Hang> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new Hang(in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        for (Hang h : a)
            System.out.println(h);
    }
}
