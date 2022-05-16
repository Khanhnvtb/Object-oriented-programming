//Created by Khanh Nguyen Van

package J05032;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Nguoi> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Nguoi(in.nextLine()));
        }
        Collections.sort(a);
        System.out.println(a.get(a.size() - 1));
        System.out.println(a.get(0));
    }
}
