package com.vaibhav;

import java.util.Arrays;

public class Mult {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,3,-3};
        System.out.println("input " + Arrays.toString(arr));
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    static int[] productExceptSelf(int[] nums) {

        // Initiating variable
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for (int j = 1; j < nums.length; j++) {
            ans[j] = ans [j-1] * nums[j-1];
        }

        int mult2 = 1;
        for (int j = nums.length-2; j >= 0; j--) {
            mult2 = mult2 * nums[j+1];
            ans[j] = ans[j]*mult2;
        }


        return ans;
    }

}
