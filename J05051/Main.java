//Created by Khanh Nguyen Van

package J05051;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Dien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new Dien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a);
        for (Dien d : a) {
            System.out.println(d);
        }
    }
}
