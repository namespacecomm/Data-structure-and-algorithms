package com.vaibhav;

public class Position {
    public static void main(String[] args) {

    }
}

//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//
//        int[] ans = new int[2];
//        ans[0] = firstOcc(nums, target);
//        ans[1] = lastOcc(nums, target);
//
//        return ans;
//    }
//
//    static int firstOcc(int[] nums, int target) {
//        int high = nums.length - 1;
//        int low = 0;
//
//        while (high >= low) {
//            int mid = (low + high)/2;
//
//            if (target > nums[mid]) {
//                low = mid + 1;
//            } else if (target < nums[mid]) {
//                high = mid - 1;
//            } else {
//                if (mid == 0 || nums[mid] != nums[mid - 1]) {
//                    return mid;
//                } else {
//                    high = mid -1;
//                }
//            }
//        }
//        return -1;
//    }

    static int lastOcc(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;

        while (high >= low) {
            int mid = (low + high)/2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                if (mid == nums.length-1 || nums[mid] != nums[mid+1]){
                    return mid;
                }else {
                    low = mid+1;
                }
            }

        }
        return -1;

    }

}