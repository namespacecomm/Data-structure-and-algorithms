package com.vaibhav;

import java.util.Arrays;

public class HardMax {
    public static void main(String[] args) {
        int[] ans = new int[10];
        System.out.println(Arrays.toString(ans));

    }
}

//class Solution {
//    public int findMaxValueOfEquation(int[][] points, int k) {
//        int max = Integer.MIN_VALUE;
//        int f = 1;
//        for (int i = 0; i < points.length; i++) {
//           if (f < i+1){
//               f = i+1;
//           }
//            for (int j = f; j<points.length; j++) {
//                if (points[j][0] > points[i][0] + k){
//                    break;
//                }
//                if (points[i][1] - points[i][0] + points[j][0] + points[j][1] > max) {
//                    max = points[i][1] - points[i][0] + points[j][0] + points[j][1];
//                    f=j-1;
//                }
//            }
//
//        }
//        return max;
//    }
//
//}


//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        for (int i = 1; i <= nums.length; i++) {
//            boolean checker = false;
//            for (int j = 0; j < nums.length; j++) {
//                if (i == nums[j]) {
//                    checker = true;
//                    break;
//                }
//            }
//            if (!checker) {
//                return i;
//            }
//        }
//        return nums.length + 1;
//    }
//}

//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        int[] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] <= nums.length && nums[i] >0) {
//                arr[nums[i]-1] = nums[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){
//                return i + 1;
//            }
//        }
//        return arr.length +1;
//    }
//}

class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        for(int i =1; i<nums.length; i++){
            gcd = GCD(gcd, nums[i]);
            if (gcd==1)
                return true;
        }
        return gcd ==1;

    }
    int GCD(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return GCD(b, a%b);
        }

    }
}