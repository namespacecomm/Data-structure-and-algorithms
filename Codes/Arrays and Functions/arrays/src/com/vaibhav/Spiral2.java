package com.vaibhav;

public class Spiral2 {
    public static void main(String[] args) {
        generateMatrix(4);
    }


    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int k = n - 1;
        int a = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < (n+1)/2 ; i++) {

            for (int j = i; j <= k - i && a <= n*n; j++) {
                a++;
                System.out.println(a);
                y = j;
                arr[x][y] = a;
                System.out.println(x + " " + y);

            }

            for (int j = i+1; j <= k - i && a <= n*n; j++) {
                a++;
                System.out.println(a);
                x = j;
                arr[x][y] = a;
                System.out.println(x + " " + y);

            }

            for (int j = k-1-i; j >= i && a <= n*n; j--) {
                a++;
                System.out.println(a);
                y = j;
                arr[x][y] = a;
                System.out.println(x + " " + y);

            }

            for (int j = k-1-i; j >= i+1 && a <= n*n; j--) {
                a++;
                System.out.println(a);
                x = j;
                arr[x][y] = a;
                System.out.println(x + " " + y);

            }
        }
        return arr;


    }


    }


//class Solution {
//    public int[][] generateMatrix(int n) {
//
//    }
//}
