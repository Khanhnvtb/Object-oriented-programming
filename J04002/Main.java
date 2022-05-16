//Created by Khanh Nguyen Van

package J04002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HCN h = new HCN();
        h.Rectange(Double.parseDouble(in.next()), Double.parseDouble(in.next()), in.nextLine());
        System.out.println(h);
    }
}
