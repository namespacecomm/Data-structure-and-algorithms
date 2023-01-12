package com.vaibhav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Medium {
    public static void main(String[] args) {
        System.out.println((5+2)/2);
    }

}

//class Solution {
//    public int singleNonDuplicate(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        if (nums[0] != nums[1]) {
//            return nums[0];
//        }
//        if (nums[nums.length-2] != nums[nums.length-1]) {
//            return nums[nums.length-1];
//        }
//        int start = 1;
//        int end = nums.length-2;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//
//            if (mid % 2 == 0){
//                if (nums[mid] == nums[mid+1]) {
//                    start = mid + 1;
//                } else if (nums[mid] == nums[mid - 1]) {
//                    end = mid - 1;
//                } else {
//                    return nums[mid];
//                }
//            } else {
//                if (nums[mid] == nums[mid+1]) {
//                    end = mid - 1;
//                } else if (nums[mid] == nums[mid - 1]) {
//                    start = mid + 1;
//                } else {
//                    return nums[mid];
//                }
//            }
//
//        }
//        return -1;
//    }
//}



//class Solution {
//    public boolean search(int[] nums, int target) {
//        int start,end;
//        System.out.println(rotationMeasure(nums));
//        if (target <= nums[nums.length-1]) {
//            start = rotationMeasure(nums);
//            end = nums.length-1;
//        } else {
//            start = 0;
//            end = rotationMeasure(nums) - 1;
//        }
//
//        while (start <= end) {
//            int mid = (start + end)/2;
//
//            if (nums[mid] > target) {
//                end = mid - 1;
//            } else if (nums[mid] < target) {
//                start = mid + 1;
//            } else {
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//    static int rotationMeasure (int[] nums) {
//
//
//        int start = 1;
//        int end = nums.length - 1;
//
//        if (nums[end] > nums[0]) {
//            return 0;
//        }
//        int k = nums.length - 1;
//        for (int i = nums.length-1; i >= 0; i--) {
//            if (nums[i] == nums[0]) {
//                k -= 1;
//            }else {
//                break;
//            }
//        }
//        while (start <= end) {
//            int mid = (start + end)/2;
//
//            if (nums[mid] < nums[mid-1]) {
//                return mid;
//            } else if (nums[mid] >= nums[0]) {
//                start = mid +1 ;
//            } else if (nums[mid] <= nums[k]) {
//                end = mid - 1;
//            }
//        }
//        return 0;
//    }
//}


//class Solution {
//    public boolean search(int[] nums, int target) {
//        int n = nums.length;
//        if (n == 0) return false;
//        int end = n - 1;
//        int start = 0;
//
//        while(start <= end) {
//            int mid = start + (end-start)/2;
//
//            if (nums[mid] == target) return true;
//
//            if (isBinaryUseful(nums, start, target)) {
//                start++;
//                continue;
//            }
//
//            boolean midArr = inFirstArray(nums, start, nums[mid]);
//            boolean tarArr = inFirstArray(nums, start, target);
//
//            if (midArr ^ tarArr) {
//                if (tarArr) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (nums[mid] < target) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return false;
//    }
//
//    static boolean isBinaryUseful (int[] arr, int start, int element) {
//        return arr[start] != element;
//    }
//
//    static boolean inFirstArray (int[] arr, int start, int element){
//        return arr[start] <= element;
//    }
//}
//
//


//class Solution {
//    public int findMin(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        if (nums[start] <= nums[end]) {
//            return nums[0];
//        }
//
//        while (start <= end) {
//            int mid = start + (end-start)/2 ;
//            if (mid > 0) {
//                if (nums[mid] < nums[mid-1]) {
//                    return nums[mid];
//                }
//            }
//             if (nums[mid] <= nums[nums.length-1]) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//        }
//        return -1;
//    }
//}

//
//class Solution {
//    public int reachNumber(int target) {
//        int value = Math.abs(target);
//        int step = 0;
//        int sum = 0;
//
//
//
//        while (sum < value || (sum-value) %2 != 0) {
//            step++;
//            sum += step;
//        }
//        return sum;
//    }
//}


//class Solution {
//
//    public static void main(String[] args) {
//        System.out.println(maxValue(4, 2, 6));
//    }
//
//    static int maxValue(int n, int index, int maxSum) {
//        System.out.println("number of terms at left is " + index);
//        int l = n - index - 1;
//        System.out.println("number of terms at right is " + l);
//        System.out.println();
//
//        int start = 1;
//        int end = maxSum;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//            long a = mSum(n,index,mid);
//            if (a == maxSum) {
//                return mid;
//            } else if (a > maxSum) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return end;
//    }
//
//    static long mSum(int n, int b, int x){
//
//        long m = nTerms1(n,b,x) + nTerms2(n,b,x) + x;
//        System.out.println("value at " + x + " is " + m);
//        System.out.println();
//        return m;
//
//
////        long m = nTerms(x-1) - nTerms(x-1-index) + nTerms(x-1) - nTerms(x-n+index) + x;
////        System.out.println("value at " + x + " is " + m);
////        return m;
//    }
//
//    static long nTerms1(int n, int b, int x){
//        if (b == 0) {
//            return 0;
//        }
//
//
//        if (x-1-b < 0) {
//            long a = ((x*x) - (3*x) + 2 + (2*b))/2;
//            System.out.println("left value under negative is " + a);
//            return a;
//        } else {
//            long a = (b*((2*x) - 1 - b))/2;
//            System.out.println("left value under positive is " + a);
//            return a;
//        }
////        if (a<0) {
////            return (long) a;
////        }
////        long x = (a*(a+1))/2;
////        return x;
//    }
//
//    static long nTerms2(int n, int b, int x){
//        long l = n - b - 1;
//        long k = (-2)*x;
//        if (l == 0) {
//            return 0;
//        }
//
//        if (l == 1) {
//            return x-1;
//        }
//
//
//        if (x-n+b < 0) {
//            long a = ((x*(x-1))/2)-(x-n+b);
//            System.out.println("right value under negative is " + a);
//            return a;
//        } else {
//            long f = k - ((l+k)*(l+1));
//            long a = f/2;
//
//            System.out.println("right value under positive is " + a);
//            return a;
//        }
//    }
//
//
//
//}

//class Solution {
//    public static void main(String[] args) {
//        int[] arr = {1,1,1,999999999};
//        System.out.println(minEatingSpeed(arr,10));
//    }
//    static int minEatingSpeed(int[] piles, int h) {
//        int max = 0;
//        for (int i = 0; i < piles.length; i++) {
//            if (max < piles[i]) {
//                max = piles[i];
//            }
//        }
//
//        int start = 1;
//        int end = max;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//            long k = hrsFinder(piles, mid);
//
////            if (k == h) {
////                return mid;
////            } else
//            if (k > h) {
//                start = mid + 1;
//
//            } else {
//                end = mid -1;
//            }
//        }
//        return start;
//    }
//
//    static long hrsFinder (int[] piles, int x) {
//        long sum = 0;
//        for (int i = 0; i < piles.length; i++) {
//            long a = piles[i]/x;
//            if (piles[i]%x > 0) {
//                a++;
//            }
//            sum += a;
//            System.out.println("bananas:" + piles[i] + ", rate:" + x + ", hrs:" + a );
//        }
//        System.out.println(sum);
//        System.out.println();
//
//        return sum;
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        int[] arr1 = {};
//
//        int[] arr2 = {};
//
//        System.out.println(minAbsoluteSumDiff(arr1, arr2));
//    }
//    static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//        int maxSum = 0;
//        int maxDiffCreated = 0;
//
//        int[] arr = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            arr[i] = nums1[i];
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < nums1.length; i++) {
//            int diff = Math.abs(nums1[i] - nums2[i]);
//            System.out.println("difference at " + i + " index is " + diff);
//            maxSum += diff;
//
//            int num = binarySearch(arr, nums2[i]);
//            int newDiff = Math.abs(num - nums2[i]);
//            int diffCreated = Math.abs(newDiff-diff);
//            maxDiffCreated = Math.max(maxDiffCreated, diffCreated);
//
//
//        }
//        return (maxSum-maxDiffCreated);
//
//
//
//
//    }
//
//    static int binarySearch (int[] arr, int x) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//            if (arr[mid] == x) {
//                return arr[mid];
//            } else if (arr[mid] > x) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        if (end <= 0) {
//            end = 0;
//        }
//        if (start >= arr.length -1) {
//            start = arr.length-1;
//        }
//        if (Math.abs(x-arr[end]) < Math.abs(x- arr[start])){
//            return arr[end];
//        } else {
//            return arr[start];
//        }
//    }
//}


//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if (target < matrix[0][0] || target > matrix [matrix.length-1][matrix[0].length-1]) {
//            return false;
//        }
//        int x = search(matrix, target);
//        return search2(matrix, target, x);
//
//    }
//
//    static int search(int[][] arr,int x) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<= end) {
//            int mid = start + (end-start)/2;
//            if (arr[mid][0] == x) {
//                return mid;
//            } else if (arr[mid][0] < x) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return end;
//    }
//
//    static boolean search2(int[][] arr,int x, int num) {
//        int start = 0;
//        int end = arr[num].length-1;
//
//        while (start<= end) {
//            int mid = start + (end-start)/2;
//            if (arr[num][mid] == x) {
//                return true;
//            } else if (arr[num][mid] < x) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return false;
//    }
//}

//class Solution {
//    public int[] findPeakGrid(int[][] mat) {
//
//        int lasti = mat.length-1;
//        int lastj = mat[0].length - 1;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[0].length; j++) {
//                if(compare(mat,i,j)) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    static boolean compare(int[][] mat, int i, int j) {
//        boolean x = compareLeft (mat, i, j);
//        if (!x) {
//            return false;
//        }
//        x = compareRight (mat, i, j);
//        if (!x) {
//            return false;
//        }
//        x = compareTop (mat, i, j);
//        if (!x) {
//            return false;
//        }
//        x = compareBottom (mat, i, j);
//        if (!x) {
//            return false;
//        }
//
//        return true;
//    }
//
//    static boolean compareLeft (int[][] mat, int i, int j) {
//        if (j == 0) {
//            return true;
//        }
//
//        if (mat[i][j] > mat[i][j-1]) {
//            return true;
//        }
//
//        return false;
//    }
//
//    static boolean compareRight (int[][] mat, int i, int j) {
//        if (j == mat[0].length-1) {
//            return true;
//        }
//
//        if (mat[i][j] > mat[i][j+1]) {
//            return true;
//        }
//
//        return false;
//    }
//
//    static boolean compareTop (int[][] mat, int i, int j) {
//        if (i == 0) {
//            return true;
//        }
//
//        if (mat[i][j] > mat[i-1][j]) {
//            return true;
//        }
//
//        return false;
//    }
//
//    static boolean compareBottom (int[][] mat, int i, int j) {
//        if (i == mat.length-1) {
//            return true;
//        }
//
//        if (mat[i][j] > mat[i+1][j]) {
//            return true;
//        }
//
//        return false;
//    }
//}

//class Solution {
//    public int maxFrequency(int[] nums, int k) {
//        Arrays.sort(nums);
//        int max = 0;
//        for (int i = 0; i <nums.length; i++) {
//            max = Math.max(max, filler(nums,i,k));
//        }
//        return max;
//
//    }
//
//    static int filler(int[] arr, int index, int k) {
//        int x= 1;
//        int i = 1;
//        int l = k;
//        while (l > 0) {
//            if (index - i < 0) {
//                break;
//            }
//            if (l >= arr[index]-arr[index-i]) {
//                l -= arr[index]-arr[index-1];
//                x++;
//                i++;
//            } else  {
//                break;
//            }
//        }
//        return x;
//    }
//}


//class Solution {
//    public int[] findRightInterval(int[][] intervals) {
//        int arr[][] = new int[intervals.length][2];
//        for (int i = 0; i < intervals.length; i++) {
//            arr[i][0] = intervals[i][0];
//            arr[i][1] = i;
//        }
//
//        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//
//        int[] ans = new int[intervals.length];
//
//        for (int i = 0; i < intervals.length; i++) {
//            ans[i] = search(arr, intervals[i][1]);
//        }
//
//        return ans;
//
//    }
//
//    static int search (int[][] arr, int x) {
//        if (x < arr[0][0]) {
//            return -1;
//        }
//        if (x > arr[arr.length-1][0]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end ) {
//            int mid = start + (end - start)/2 ;
//            if (arr[mid][0] == x) {
//                return arr[mid][1];
//            } else if (arr[mid][0] >= x) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return arr[start][1];
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        System.out.println(sum(5));
//    }
//    public int maxValue(int n, int index, int maxSum) {
//        long l = index;
//        long r = n - index - 1;
//        long res = 0;
//        long lo = 1;
//        long hi = maxSum;
//
//
//        while (lo <= hi) {
//            long mid = lo + (hi - lo)/2;
//            long sum = mid;
//
//            long ls = 0;
//            long rs = 0;
//            long num = mid - 1;
//
//
//            if (num >= l) {
//                ls = sum(num) - sum(num-l);
//            } else {
//                ls = sum(num) + (l - num);
//            }
//
//            if (num >= r) {
//                rs = sum(num) - sum(num-r);
//            } else {
//                rs = sum(num) + (r - num);
//            }
//
//            sum += ls + rs;
//
//            if (sum <= maxSum) {
//                lo = mid + 1;
//                res = mid;
//            } else {
//                hi = mid-1;
//            }
//
//        }
//        return (int) res;
//    }
//
//    static long sum (long m) {
//        return (m)*(m+1)/2;
//    }
//}

//class Solution {
//    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//        long orgAbsDiff = 0;
//        int[] nums1Sorted = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            // original maxdiff calculation
//            orgAbsDiff += Math.abs(nums2[i] - nums1[i]);
//
//            // array copying
//            nums1Sorted[i] = nums1[i];
//        }
//        Arrays.sort(nums1Sorted);
//    }
//}


//class Solution {
//
//    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//        long maxSum = 0;
//        long maxDiffCreated = 0;
//
//        int[] arr = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            arr[i] = nums1[i];
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < nums1.length; i++) {
//            long diff = Math.abs(nums1[i] - nums2[i]);
//            maxSum += diff;
//
//            long num = binarySearch(arr, nums2[i]);
//            long newDiff = Math.abs(num - nums2[i]);
//            long diffCreated = Math.abs(diff - newDiff);
//            maxDiffCreated = Math.max(maxDiffCreated, diffCreated);
//
//
//        }
//        System.out.println(maxSum);
//        System.out.println(maxDiffCreated);
//
//        return (int) (maxSum-maxDiffCreated)%1000000007;
//
//
//
//
//    }
//
//    static int binarySearch (int[] arr, int x) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//            if (arr[mid] == x) {
//                return arr[mid];
//            } else if (arr[mid] > x) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        if (end <= 0) {
//            end = 0;
//        }
//        if (start >= arr.length -1) {
//            start = arr.length-1;
//        }
//        if (Math.abs(x-arr[end]) < Math.abs(x- arr[start])){
//            return arr[end];
//        } else {
//            return arr[start];
//        }
//    }
//}
//
//


//class Solution {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                if (target < nums[i]) {
//                    break;
//                }
//            }
//
//
//
//            if (i == nums.length-1) {
//                break;
//            }
//            if (i > 0) {
//                if (nums[i] == nums[i-1]){
//                    continue;
//                }
//            }
//
//            for (int j = i+1; j < nums.length ; j++) {
//
//                if (nums[j] > 0) {
//                    if (target-nums[i] < nums[j]) {
//                        break;
//                    }
//                }
//
//
//                if (j == nums.length-1) {
//                    break;
//                }
//                if (j > i+1) {
//                    if (nums[j] == nums[j-1]){
//                        continue;
//                    }
//                }
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[k] > 0) {
//                        if (target-nums[i] -nums[j] < nums[k]) {
//                            break;
//                        }
//                    }
//
//
//                    if (k == nums.length-1) {
//                        break;
//                    }
//                    if (k > j+1) {
//                        if (nums[k] == nums[k-1]){
//                            continue;
//                        }
//                    }
//                    System.out.println(nums[i]);
//                    System.out.println(nums[j]);
//                    System.out.println(nums[k]);
//                    long sum = nums[i];
//                    sum += nums[j];
//                    sum += nums[k];
//                    System.out.println("sum is " + sum);
//                    long req = target - sum;
//                    System.out.println("Requirement is" + req);
//                    if (req < nums[k]) {
//                        break;
//                    }
//                    for (int l = k + 1; l < nums.length; l++) {
//                        if (nums[l] == req) {
//                            System.out.println("Number is" + nums[l]);
//                            System.out.println(nums[l] == req);
//                            List<Integer> arr = new ArrayList<Integer>();
//                            arr.add(nums[i]);
//                            arr.add(nums[j]);
//                            arr.add(nums[k]);
//                            arr.add(nums[l]);
//                            System.out.println(Arrays.toString(arr.toArray()));
//                            ans.add(arr);
//                            break;
//
//                        }
//                    }
//                }
//
//            }
//        }
//        return ans;
//    }
//}


class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i <nums.length; i++) {

            max = Math.max(max, filler(nums,i,k));
        }
        return max;

    }

    static int filler(int[] arr, int index, int k) {

        int x= 1;
        for (int i = index+1; i < arr.length; i++) {
            if (arr[i] ==  arr[index]) {
                x++;
            } else {
                break;
            }
        }
       int i = 1;
        int l = k;
        while (l >= 0) {
            if (index - i < 0) {
                break;
            }
            if (l >= arr[index]-arr[index-i]) {
                l -= arr[index]-arr[index-i];
                x++;
                i++;
            } else  {
                break;
            }
        }
        return x;
    }
}