package J07057;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            a.add(new ThiSinh(i, in.nextLine(), Double.parseDouble(in.nextLine()), in.nextLine(),
                    Integer.parseInt(in.nextLine())));
        Collections.sort(a);
        for (ThiSinh ts : a)
            System.out.println(ts);
    }
}
