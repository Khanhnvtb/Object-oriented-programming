//Created by Khanh Nguyen Van

package J04017;

import java.util.Scanner;

public class Matrix {
    private int row, col;
    private int a[][];

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public void nextMatrix(Scanner sc) {
        int a[][] = new int[this.row][this.col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                a[i][j] = sc.nextInt();
        this.setA(a);
    }

    public Matrix trans() {
        Matrix m = new Matrix(col, row);
        int a[][] = new int[col][row];
        for (int i = 0; i < col; i++)
            for (int j = 0; j < row; j++)
                a[i][j] = this.a[j][i];
        m.setA(a);
        return m;
    }

    public Matrix mul(Matrix m) {
        Matrix ans = new Matrix(this.row, m.col);
        int a[][] = new int[this.row][m.col];
        for (int i = 0; i < this.row; i++)
            for (int j = 0; j < m.col; j++) {
                a[i][j] = 0;
                for (int k = 0; k < this.col; k++)
                    a[i][j] += this.a[i][k] * m.a[k][j];
            }
        ans.setA(a);
        return ans;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                res += a[i][j] + " ";
            res += "\n";
        }
        return res;
    }
}
