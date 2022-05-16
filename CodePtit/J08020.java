package CodePtit;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    static boolean compare(char x, char y){
        if(x =='(' && y == ')') return true;
        else if(x=='[' && y == ']') return true;
        else if(x=='{' && y == '}') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) st.push(s.charAt(i));
                else {
                    if (compare(st.peek(),s.charAt(i))) st.pop();
                    else st.push(s.charAt(i));
                }
            }
            if (!st.isEmpty()) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
