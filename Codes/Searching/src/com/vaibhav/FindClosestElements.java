package com.vaibhav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindClosestElements {
    public static void main(String[] args) {


        int[] arr = new int[5];
        arr = new int[]{0,1,2,2,2,3,6,8,8,9};

        int k = 5;
        int x = 9;

        findClosestElements(arr,k,x);


    }

    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<Integer>(k);
        int res = search(arr, x);

        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }

        if (x >= arr[arr.length-1]) {
            for (int i = arr.length-1; i > arr.length-1-k ; i--) {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        int a = res;
        int b = res + 1;
        System.out.println(ans.toString());


        while (ans.size() < k) {
            System.out.println(ans.toString());

            if (a < 0) {
                ans.add(arr[b]);
                b++;
                continue;
            }

            if (b > arr.length-1) {
                ans.add(arr[a]);
                a--;
                continue;
            }

            if (Math.abs(arr[a] - x) < Math.abs(arr[b] - x)){
                ans.add(arr[a]);
                a--;
            } else if (Math.abs(arr[a] - x) > Math.abs(arr[b] - x)) {
                ans.add(arr[b]);
                b++;
            } else {
                if (arr[a] < arr[b]) {
                    ans.add(arr[a]);
                    a--;
                } else {
                    ans.add(arr[b]);
                    b++;
                }
            }


        }

        Collections.sort(ans);
        System.out.println(ans);


        return ans;
    }

    static int search(int[] arr, int x ) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end-start)/2;

            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}

//class Solution {
//
//
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        ArrayList<Integer> ans = new ArrayList<Integer>(k);
//        int res = search(arr, x);
//
//        if (x <= arr[0]) {
//            for (int i = 0; i < k; i++) {
//                ans.add(arr[i]);
//            }
//            return ans;
//        }
//
//        if (x >= arr[arr.length-1]) {
//            for (int i = arr.length-1; i > arr.length-1-k ; i--) {
//                ans.add(arr[i]);
//            }
//            return ans;
//        }
//        ans.add(arr[res]);
//        int a = res-1;
//        int b = res + 1;
//
//        for (int i = 0; i < k; i++) {
//            ans.add(0);
//        }
//
//        while (ans.get(k) == 0) {
//
//            if (a < 0) {
//                ans.add(arr[b]);
//                b++;
//                continue;
//            }
//
//            if (b > arr.length-1) {
//                ans.add(arr[a]);
//                a--;
//                continue;
//            }
//
//            if (Math.abs(arr[a] - x) < Math.abs(arr[b] - x)){
//                ans.add(arr[a]);
//                a--;
//            } else if (Math.abs(arr[a] - x) > Math.abs(arr[b] - x)) {
//                ans.add(arr[b]);
//                b++;
//            } else {
//                if (arr[a] < arr[b]) {
//                    ans.add(arr[a]);
//                    a--;
//                } else {
//                    ans.add(arr[b]);
//                    b++;
//                }
//            }
//
//
//        }
//
//
//        return ans;
//    }
//
//    static int search(int[] arr, int x ) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (end >= start) {
//            int mid = start + (end-start)/2;
//
//            if (arr[mid] < x) {
//                start = mid + 1;
//            } else if (arr[mid] > x) {
//                end = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return end;
//    }
//}