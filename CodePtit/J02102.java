//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < n * n; i++) l.add(in.nextInt());
        Collections.sort(l);
        int inDex = 0, ans[][] = new int[n][n];
        int startRow = 0, endRow = n - 1, startCol = 0, endCol = n - 1;
        while (inDex < l.size()) {
            for (int i = startCol; i <= endCol; i++) ans[startRow][i] = l.get(inDex++);
            startRow++;
            for (int i = startRow; i <= endRow; i++) ans[i][endCol] = l.get(inDex++);
            endCol--;
            for (int i = endCol; i >= startCol; i--) ans[endRow][i] = l.get(inDex++);
            endRow--;
            for (int i = endRow; i >= startRow; i--) ans[i][startCol] = l.get(inDex++);
            startCol++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
}
