package File;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class J07005 {
    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1000];
        for (int i = 0; i < 100000; i++)
            a[in.readInt()]++;
        for (int i = 0; i < 1000; i++)
            if (a[i] > 0) System.out.println(i + " " + a[i]);
    }
}