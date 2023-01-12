package com.vaibhav;

public class Jump {
    public static void main(String[] args) {

    }
}

//class Solution {
//    public boolean canJump(int[] nums) {
//        int reachable = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==0 && reachable <= i){
//                break;
//            }
//            reachable = Math.max(reachable,(nums[i]+i));
//
//        }
//
//        return reachable >= nums.length - 1;
//    }
//}
//
