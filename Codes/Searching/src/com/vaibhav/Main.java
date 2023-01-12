package com.vaibhav;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}


//class Solution {
//    static int mySqrt(int x) {
//        if (x == 0 || x == 1) {
//            return x;
//        }
//
//
//        int start = 0;
//        int end = x/2;
//        int ans = 0;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//            if (mid*mid > x) {
//                end = mid - 1;
//            } else {
//                ans = mid;
//                start = mid +1;
//            }
//        }
//        return ans;
//    }
//}


//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//        int end = n;
//        int start = 1;
//        int mid = start + (end - start)/2;
//        while (start <= end) {
//
//            if (guess(mid) == -1) {
//                end = mid - 1;
//            } else if (guess(mid) == 1){
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//            mid = start + (end - start)/2;
//        }
//        return mid;
//    }
//}

//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int e = n;
//        int s = 1;
//
//        while ( s < e ) {
//            int m = s + (e-s)/2;
//            if(isBadVersion(m)){
//                e = m;
//
//            } else {
//                s = m + 1;
//            }
//
//        }
//        return s;
//    }
//}



//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int[] arr = {0 , 0};
//        int s = 0;
//        int e = numbers.length-1;
//
//        for (int i = 0; i < numbers.length-1; i++) {
//            s = i+1;
//            int k = target - numbers[i];
//            int m = s + (e-s)/2;
//            while (s <= e) {
//                if(numbers[m] < k) {
//                    s = m + 1;
//                } else if (numbers[m] > k) {
//                    e = m -1;
//                } else {
//                    arr[0] = i + 1;
//                    arr[1] = m +1;
//                    return arr;
//                }
//                m = s + (e-s)/2;
//            }
//        }
//        return arr;
//
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        System.out.println(isPerfectSquare(5));
//    }
//    static boolean isPerfectSquare(int num) {
//        if ( num == 1 ) {
//            return true;
//        }
//
//        int s = 1;
//        int e = num/2;
//        int m  = s + (e-s)/2;
//
//        while (s <= e) {
//            if (m > num/m ) {
//                e = m-1;
//            } else if (m < num/m) {
//                s = m+1;
//            } else {
//                if ( m * m == num ) {
//                    return true;
//                } else {
//                    return false;
//                }
//
//            }
//            m  = s + (e-s)/2;
//        }
//        return false;
//    }
//}

//class Solution {
//    public int arrangeCoins(int n) {
//        int start =  1;
//        int end = n;
//        int mid = start + (end - start)/2;
//        long temp = (long) (mid) *(mid + 1)/2;
//
//        while (start <= end) {
//
//
//
//            if ( temp < n) {
//                start = mid + 1;
//            } else if (temp > n) {
//                end = mid - 1;
//            } else {
//                return mid;
//            }
//            mid = start + (end - start)/2;
//            temp = (long) (mid) *(mid + 1)/2;
//        }
//        return end;
//
//    }
//
//
//}


//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//        if (target >= letters[letters.length-1]) {
//            return letters[0];
//        }
//        int start = 0;
//        int end = letters.length-1;
//
//        int mid = (start + (end-start)/2);
//
//        while (start <= end) {
//            if (letters[mid] > target) {
//                end = (mid - 1);
//            } else if (letters[mid] < target) {
//                start = (mid + 1);
//            } else {
//                if (letters[mid + 1] > target) {
//                    return letters[mid + 1];
//                } else {
//                    start = mid + 1;
//                }
//            }
//            mid = (start + (end-start)/2);
//        }
//        return letters[start];
//    }
//}
//
//
//class Solution {
//
//    public int findKthPositive(int[] arr, int k) {
//        if (missingNumbers(arr[0], 0) >= k) {
//            return k ;
//        }
//        int start = 0;
//        int end = arr.length -1;
//        int mid = start + (end - start)/2;
//
//        while (start <= end) {
//            if ( missingNumbers(arr[mid],mid) > k) {
//                end = mid - 1;
//            } else if ( missingNumbers(arr[mid],mid) < k) {
//                start = mid  + 1;
//            } else {
//                if (arr[mid-1] + 1 == arr[mid]){
//                    end = mid -1;
//                } else {
//                    return arr[mid]-1;
//                }
//            }
//            mid = start + (end - start)/2;
//        }
//        return arr[end] + (k - missingNumbers(arr[end],end));
//    }
//    static int missingNumbers(int num, int index) {
//        return num - index - 1 ;
//    }
//}


//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        if (target <= nums[0]){
//            return 0;
//        }
//        if (target > nums[nums.length-1]) {
//            return nums.length;
//        }
//        int start = 0;
//        int end = nums.length-1;
//        int mid = start + (end - start)/2;
//
//        while (start <= end) {
//            if (nums[mid] > target) {
//                end = mid - 1;
//            } else if (nums[mid] < target) {
//                start = mid + 1;
//            } else {
//                if (nums[mid-1] < nums[mid]){
//                    return mid;
//                } else {
//                    end = mid-1;
//                }
//            }
//            mid = start + (end - start)/2;
//        }
//        return start;
//    }
//}

//class Solution {
//    public int peakIndexInMountainArray(int[] arr) {
//        int start = 1;
//        int end = arr.length-2;
//        int mid = start + (end - start)/2;
//
//        while (start <= end) {
//            if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
//                start = mid +1;
//            } else if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) {
//                end = mid -1;
//            } else {
//                return mid;
//            }
//            mid = start + (end - start)/2;
//        }
//        return mid;
//    }
//}


//class Solution {
//    public int countNegatives(int[][] grid) {
//        int ans = 0;
//
//        for (int[] arr:grid) {
//            if (arr[arr.length-1] < 0){
//                int start = 0;
//                int end = arr.length-1;
//                int mid = start + (end-start)/2;
//
//                while (start <= end) {
//                    if(arr[mid] > 0) {
//                        start = mid + 1;
//                    } else if (arr[mid] < 0) {
//                        end = mid-1;
//                    } else {
//                        if (arr[mid+1] < 0) {
//                            end = mid;
//                            break;
//                        }else {
//                            start = mid +1;
//                        }
//                    }
//                    mid = start + (end-start)/2;
//                }
//                ans = ans + (arr.length-1-end);
//            }
//
//
//        }
//
//        return ans;
//    }
//}

//class Solution {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < 1001; i++) {
//            if (inArr(i,nums1) && inArr(i, nums2)){
//                ans.add(i);
//            }
//        }
//        int[] finalAns = new int[ans.size()];
//        for (int i = 0; i < ans.size()-1; i++) {
//            finalAns[i] = ans.get(i);
//        }
//        return finalAns;
//
//
//
//    }
//    static boolean inArr(int num, int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == num) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//}


//class Solution {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        int[] arr1 = new int[1001];
//        int[] arr2 = new int[1001];
//
//        for (int i = 0; i < nums1.length; i++) {
//                arr1[nums1[i]]++;
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//                arr2[nums2[i]]++;
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] > 0 && arr2[i] > 0) {
//                for (int j = 0; j < Math.min(arr1[i],arr2[i] ); j++) {
//                    ans.add(i);
//                }
//            }
//        }
//
//        int[] finalAns = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++) {
//            finalAns[i] = ans.get(i);
//        }
//
//        return finalAns;
//    }
//}

//class Solution {
//    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//        int sum1 = 0, sum2 = 0;
//        int[] ans = new int[2];
//
//        for (int element : aliceSizes) {
//            sum1 += element;
//        }
//
//        for (int element : bobSizes) {
//            sum2 += element;
//        }
//
//        int diff = (sum2 -sum1)/2;
//
//        Arrays.sort(bobSizes);
//
//        for (int num: aliceSizes) {
//            sum1 = 0;
//            sum2 = bobSizes.length-1;
//            int mid = sum1 + (sum2-sum1)/2 ;
//
//            while (sum1 <= sum2 ) {
//                if (bobSizes[mid] < num - diff) {
//                    sum1 = mid + 1;
//                } else if (bobSizes[mid] > num - diff) {
//                    sum2 = mid - 1;
//                } else {
//                    ans[0] = num;
//                    ans[1] = bobSizes[mid];
//                    return ans;
//                }
//                mid = sum1 + (sum2-sum1)/2 ;
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public boolean checkIfExist(int[] arr) {
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("test element" + arr[i] + "   test index" + i);
//            int start = i + 1;
//
//            int end = arr.length-1;
//            int mid = start + (end-start)/2;
//
//            if (arr[i] >= 0) {
//                while (start <= end) {
//
//                    System.out.println("mid element" + arr[mid] + "  mid index" +mid);
//                    if (arr[mid] < (2 * arr[i])) {
//                        System.out.println("smaller");
//                        start = mid + 1;
//                    } else if (arr[mid] > (2 * arr[i])) {
//                        end = mid - 1;
//                        System.out.println("larger");
//                    } else {
//                        return true;
//                    }
//                    mid = start + (end-start)/2;
//                }
//            } else {
//                while (start <= end) {
//
//                    System.out.println("mid element" + arr[mid] + "  mid index" +mid);
//                    if (arr[mid]*2 < arr[i]) {
//                        System.out.println("smaller");
//                        start = mid + 1;
//                    } else if (arr[mid]*2 > arr[i]) {
//                        end = mid - 1;
//                        System.out.println("larger");
//                    } else {
//                        return true;
//                    }
//                    mid = start + (end-start)/2;
//                }
//            }
//
//
//        }
//        return false;
//    }
//}

//
//class Solution {
//    public int specialArray(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i <=100 ; i++) {
//            if (i == numbersGreater(i, nums)) {
//                return i;
//            }
//        }
//        return -1;
//
//
//    }
//
//    static int numbersGreater(int target, int[] nums) {
//        int start = 0;
//        int end = nums.length - 1 ;
//        int mid = (start + end)/2;
//        while (start <= end) {
//            if (nums[mid] > target) {
//                end = mid - 1;
//            } else if (nums[mid] < target) {
//                start = mid + 1;
//            } else {
//                if (mid == 0) {
//                    return nums.length - mid;
//                } else if (nums[mid-1] < nums[mid]){
//                    return nums.length - mid;
//                } else {
//                    end = mid - 1;
//                }
//
//            }
//            mid = (start + end)/2;
//        }
//        return nums.length - 1 - end;
//    }
//}