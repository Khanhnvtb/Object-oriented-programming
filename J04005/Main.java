//Created by Khanh Nguyen Van

package J04005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThiSinh t = new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.next()),
                Double.parseDouble(in.next()), Double.parseDouble(in.next()));
        System.out.println(t);
    }
}
