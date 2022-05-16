//Created by Khanh Nguyen Van

package J05033;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<ThoiGian> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new ThoiGian(in.nextInt(), in.nextInt(), in.nextInt()));
        Collections.sort(a);
        for (ThoiGian tmp : a)
            System.out.println(tmp);
    }
}
