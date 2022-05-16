package J07058;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MonThi> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new MonThi(in.nextLine(), in.nextLine(), in.nextLine()));
        Collections.sort(a);
        for (MonThi m : a)
            System.out.println(m);
    }
}
