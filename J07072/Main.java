package J07072;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<Ten> a = new ArrayList<>();
        while (in.hasNextLine()) {
            a.add(new Ten(in.nextLine()));
        }
        Collections.sort(a);
        for (Ten ten : a)
            System.out.println(ten);
    }
}
