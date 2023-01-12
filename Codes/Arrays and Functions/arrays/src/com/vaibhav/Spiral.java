package com.vaibhav;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int[][] in = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        spiralOrder(in);

    }
    static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>(matrix.length* matrix[0].length);
        int a = 0;
        int b = 0;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int c = (Math.min(m+1,n+1) + 1 )/2;
        for (int x = 0; x < c ; x++) {
            for (int i = x; i <= n-x; i++) {
                b = i;
                ans.add(matrix[a][b]);
                System.out.println(matrix[a][b]);
            }


            for (int i = x+1; i <= m-x; i++) {
                a = i;
                ans.add(matrix[a][b]);
                System.out.println(matrix[a][b]);
            }


            for (int i = n-x-1; i >= x ; i--) {
                if (ans.size() == matrix.length* matrix[0].length ){
                    return ans;
                }
                b = i;
                ans.add(matrix[a][b]);
                System.out.println(matrix[a][b]);
            }


            for (int i = m-x-1; i >= x+1 ; i--) {
                a = i;
                ans.add(matrix[a][b]);System.out.println(matrix[a][b]);
            }
        }

        return ans;

    }


}


//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        ArrayList<Integer> ans = new ArrayList<Integer>(matrix.length* matrix[0].length);
//        int a = 0;
//        int b = 0;
//        int m = matrix.length-1;
//        int n = matrix[0].length-1;
//        int c = (Math.min(m+1,n+1) + 1 )/2;
//        for (int x = 0; x < c ; x++) {
//            for (int i = x; i <= n-x; i++) {
//                b = i;
//                ans.add(matrix[a][b]);
//            }
//
//
//            for (int i = x+1; i <= m-x; i++) {
//                a = i;
//                ans.add(matrix[a][b]);
//            }
//
//
//            for (int i = n-x-1; i >= x ; i--) {
//                b = i;
//                ans.add(matrix[a][b]);
//            }
//
//
//            for (int i = m-x-1; i >= x+1 ; i--) {
//                a = i;
//                ans.add(matrix[a][b]);
//            }
//        }
//
//        return ans;
//
//    }
//}