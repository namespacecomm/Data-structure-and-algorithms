package com.vaibhav;

import java.util.ArrayList;
import java.util.List;

public class New {
    public static void main(String[] args) {

    }
}

//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int l = 1;
//        for (int i = 1; i < nums.length ; i++) {
//            if(nums[i-1] == nums[i] ){
//                continue;
//            }
//            nums[l] = nums[i];
//            l++;
//        }
//        return l;
//    }
//}


//class Solution {
//    public int minCostToMoveChips(int[] position) {
//        int odd = 0;
//        int even = 0;
//        for (int i = 0; i < position.length; i++) {
//            if (position[i] % 2 == 0) {
//                even++;
//            }else {
//                odd ++;
//            }
//        }
//        return Math.min(even,odd);
//    }
//}

//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        ArrayList<Integer> ans = new ArrayList<Integer>(matrix.length* matrix.length);
//        int a = 0;
//        int b = 0;
//        int n = matrix.length-1;
//
//        for (int x = 0; x < (matrix.length+1)/2 ; x++) {
//            for (int i = x; i <= n-x; i++) {
//                b = i;
//                ans.add(matrix[a][b]);
//            }
//
//
//            for (int i = x+1; i <= n-x; i++) {
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
//            for (int i = n-x-1; i >= x+1 ; i--) {
//                a = i;
//                ans.add(matrix[a][b]);
//            }
//        }
//
//        return ans;
//
////    }
//}
//
//
//// round 1
//        for (int i = 0; i <= n; i++) {
//                b = i;
//                ans.add(matrix[a][b]);
//                }
//
//                for (int i = 0; i <= n; i++) {
//                a = i;
//                ans.add(matrix[a][b]);
//                }
//
//                for (int i = n; i >= 0 ; i--) {
//                b = i;
//                ans.add(matrix[a][b]);
//                }
//
//                for (int i = n; i >= 1 ; i--) {
//                a = i;
//                ans.add(matrix[a][b]);
//                }
//
//                // round 2
//                for (int i = 1; i <= n-1 ; i++) {
//                b = i;
//                ans.add(matrix[a][b]);
//                }
//
//                for (int i = 1; i <= n-1 ; i++) {
//                a = i;
//                ans.add(matrix[a][b]);
//                }
//
//                for (int i = n-1; i >= 1 ; i--) {
//                b = i;
//                ans.add(matrix[a][b]);
//                }
//
//                for (int i = n-1; i >= 2 ; i--) {
//                a = i;
//                ans.add(matrix[a][b]);
//                }
//
//// round 3


