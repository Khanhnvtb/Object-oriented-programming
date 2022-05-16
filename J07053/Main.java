package J07053;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new ThiSinh(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine())));
        }
        for (ThiSinh t : a)
            System.out.println(t);
    }
}
