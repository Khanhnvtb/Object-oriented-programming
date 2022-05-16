import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class khaibaobienint {
    static boolean check(String s) {
        if (s.equals("main")) return false;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '[') return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("CODE.cpp"));
        long ans = 0;
        ArrayList<String> a = new ArrayList<>();
        while (in.hasNext()) {
            a.add(in.next());
        }
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i).equals("int")) {
                String s = "";
                for (int h = i + 1; h < a.size(); h++) {
                    if (a.get(h).equals(";")) break;
                    else s += a.get(h);
                }
                String str[] = s.split(",");
                for (String tmp : str) {
                    if (check(tmp)) ans += 4;
                    else {
                        String val = "";
                        for (int j = 0; j < tmp.length(); j++) {
                            if (tmp.charAt(j) == '[') {
                                for (int k = j + 1; k < tmp.length(); k++) {
                                    if (tmp.charAt(k) != ']') val += tmp.charAt(k);
                                    else {
                                        ans += Integer.parseInt(val) * 4;
                                        val = "";
                                        j = k;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
