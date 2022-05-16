//Created by Khanh Nguyen Van

package J04015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien g = new GiaoVien(in.nextLine(), in.nextLine(), Integer.parseInt(in.next()));
        System.out.println(g);
    }
}
