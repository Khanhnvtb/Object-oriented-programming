//Created by Khanh Nguyen Van

package J04006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhVien s = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.next()));
        System.out.println(s);
    }
}
