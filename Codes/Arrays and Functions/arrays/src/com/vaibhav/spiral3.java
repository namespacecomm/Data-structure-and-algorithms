package com.vaibhav;

public class spiral3 {
    public static void main(String[] args) {
        spiralMatrixIII(5, 6,1,4);
    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
       int[][] arr = new int[rows*cols][2];
       int m = rows - 1;
       int n = cols - 1;
       int a = rStart;
       int b = cStart;
       arr[0][0] = rStart;
       arr[0][1] = cStart;
       int num = 1;
        for (int i = 0; i <= Math.max(m,n); i++) {
            for (int j = 1; j <= 2*i+1  ; j++) {
                b++;
                if (b < cols && a < rows && a >= 0 && b>=0) {
                    arr[num][0] = a;
                    arr[num][1] = b;
                    num++;
                }
            }
            for (int j = 1; j <= 2*i+1  ; j++) {
                a++;
                if (b < cols && a < rows && a >= 0 && b>=0) {
                    arr[num][0] = a;
                    arr[num][1] = b;
                    num++;
                }
            }

            for (int j = 1; j <= 2*i+2  ; j++) {
                b--;
                if (b < cols && a < rows && a >= 0 && b>=0) {
                    arr[num][0] = a;
                    arr[num][1] = b;
                    num++;
                }
            }
            for (int j = 1; j <= 2*i+2  ; j++) {
                a--;
                if (b < cols && a < rows && a >= 0 && b>=0) {
                    arr[num][0] = a;
                    arr[num][1] = b;
                    num++;
                }
            }
        }
       return arr;
    }
}
