//Created by Khanh Nguyen Van

package J04013;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThiSinh t = new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
        System.out.println(t);
    }
}
