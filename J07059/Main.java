package J07059;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<CaThi> a = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            a.add(new CaThi(i, in.nextLine(), in.nextLine(), in.nextLine()));
        Collections.sort(a);
        for (CaThi c : a)
            System.out.println(c);
    }
}
