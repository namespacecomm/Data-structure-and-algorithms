package com.vaibhav;

public class Rotate {
    public static void main(String[] args) {

    }
}
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int x = k% nums.length;
//        if (x > 0) {
//            int[] arr = new int[x];
//            int pos = x-1;
//            for (int i = nums.length-1; i > nums.length-x-1 ; i--) {
//                arr[pos]= nums[i];
//                pos--;
//            }
//            for (int i = nums.length-1; i >= x; i--) {
//                nums[i]=nums[i-x];
//            }
//            for (int i = 0; i < x; i++) {
//                nums[i]= arr[i];
//            }
//        }
//
//
//
//
//    }
//}


//class Solution {
//    public void sortColors(int[] nums) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            switch (nums[i]) {
//                case 0 -> a++;
//                case 1 -> b++;
//                case 2 -> c++;
//            }
//        }
//        for (int i = 0; i < a; i++) {
//            nums[i]=0;
//        }
//        for (int i = a; i <a+b ; i++) {
//            nums[i]=1;
//        }
//        for (int i = a+b; i < a+b+c ; i++) {
//            nums[i]=2;
//        }
//    }
//}

//class Solution {
//    public int rob(int[] nums) {
//        int n = nums.length-1;
//
//
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        int a = Math.max(nums[n-1],nums[n] );
//        if (nums.length == 2){
//            return a;
//        }
//        int b = Math.max(nums[n-2] + nums[n],nums[n-1]);
//        if (nums.length == 3){
//            return b;
//        }
//        for (int i = 3; i <= n ; i++) {
//            int temp = Math.max(nums[n-i] + a, b );
//            a = b;
//            b = temp;
//        }
//
//        return b;
//
//
//
//
//    }
//}




