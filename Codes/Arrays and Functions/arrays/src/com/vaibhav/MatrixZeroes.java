package com.vaibhav;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void setZeroes(int[][] matrix) {
        ArrayList<int[]> store = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    int[] a = {i,j};
                    store.add(a);

//                    for (int k = 0; k < matrix.length; k++) {
//                        matrix[k][j] = 0;
//                    }
//                    for (int k = 0; k < matrix[0].length; k++) {
//                        matrix[i][k] = 0;
//                    }
                }
            }
        }
        for (int i = 0; i < store.size(); i++) {
            int x = store.get(i)[0];
            int y = store.get(i)[1];
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][y] = 0;
            }
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[x][k] = 0;
            }
        }
    }
}

//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//
//        // Initiating variable
//        int[] ans = new int[nums.length];
//
//        // Iterating through array
//        for (int i = 0; i < nums.length; i++) {
//
//            int neg = 0;
//
//
//            int mult = 1;
//            for (int j = 0; j < i; j++) {
//                if (nums[j] == 0) {
//                    mult = 0;
//                    break;
//                } else if (nums[j] == 1){
//                    continue;
//                } else if (nums[j] == -1) {
//                    neg ++;
//                }else {
//                    mult = mult*nums[j];
//                }
//            }
//
//            int mult2 = 1;
//            for (int j = i+1; j < nums.length && mult !=0; j++) {
//                if (nums[j] == 0) {
//                    mult2 = 0;
//                    break;
//                } else if (nums[j] == 1){
//                    continue;
//                } else if (nums[j] == -1) {
//                    neg ++;
//                }else {
//                    mult2 = mult2*nums[j];
//                }
//            }
//
//            // For all -1
//            if (neg % 2 != 0) {
//                mult = mult*mult2*(-1);
//            }else {
//                ans[i] = mult * mult2;
//            }
//        }
//        return ans;
//    }
//}
//

