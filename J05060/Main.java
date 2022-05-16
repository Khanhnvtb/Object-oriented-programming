//Created by Khanh Nguyen Van

package J05060;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<PhuHo> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new PhuHo(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine())));
        }
        for (PhuHo p : a)
            System.out.println(p);
    }
}
