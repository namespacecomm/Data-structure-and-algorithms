package com.vaibhav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Questions {
    public static void main(String[] args) {
//        int[] num  = {1, 2, 3, 4, 5, 55, 20};
//        System.out.println(Arrays.toString(reverse(num)));





    }

//    static int[] reverse (int[] arr) {
//        int[] num2 = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            num2[arr.length -i -1] = arr[i];
//        }
//        return num2;
//    }


}

//class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int[] arr = new int[2* nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            arr[i] = nums[i];
//            arr[i + nums.length] = nums[i];
//        }
//        return arr;
//    }
//}

//class sln {
//    public int[] runningSum(int[] nums) {
//        int[] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = 0; j <= i; j++) {
//                sum = sum + nums[j];
//            }
//            arr[i] = sum;
//        }
//        return arr;
//    }
//}

//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        String[] strArr = sentence.split("");
//        char[] arr = new char[strArr.length];
//        for (int i = 0; i < strArr.length; i++) {
//            arr[i] = strArr[i].toLowerCase().charAt(0);
//        }
//        boolean a = true;
//        for (char i = 97; i <= 122 ; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//                if (i == arr[j]) {
//                    a = true ;
//                    break;
//                }else {
//                    a = false;
//                }
//            }
//            if (!a) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//}

//class Solution {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int a = 0;
//        if (ruleKey.equals("type")) {
//            a = 0;
//        } else if (ruleKey.equals("color")) {
//            a = 1;
//        } else if (ruleKey.equals("name")) {
//            a = 2;
//        }
//        int b = 0;
//        for (int i = 0; i < items.size(); i++) {
//            if (ruleValue.equals(items.get(i).get(a))){
//                b++;
//            }
//        }
//        return b;
//    }
//}


//class Solution {
//    public int largestAltitude(int[] gain) {
//        int sum = 0;
//        int height = 0;
//        for (int i = 0; i < gain.length; i++) {
//            sum = sum + gain[i];
//            if ( sum >= height) {
//                height = sum;
//            }
//        }
//        return height;
//    }
//}


//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        int[][] arr = new int[image.length][image.length];
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                arr[i][j] = 1-(image[i][image[i].length - 1 - j]);
//            }
//        }
//        return arr;
//    }
//}

//class Solution {
//    public int oddCells(int m, int n, int[][] indices) {
//        int[][] arr = new int[m][n];
//        for (int i = 0; i < indices.length; i++) {
//            for (int j = 0; j < arr[indices[i][0]].length; j++) {
//                arr[indices[i][0]][j]++;
//            }
//            for (int j = 0; j < arr.length ; j++) {
//                arr[j][indices[i][1]]++;
//            }
//        }
//        int oddCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] % 2 != 0) {
//                    oddCount++;
//                }
//            }
//        }
//        return oddCount;
//    }
//}


//

//class Solution {
//    public int findNumbers(int[] nums) {
//        int ans = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int j = 0;
//            int a = nums[i];
//            while (a != 0 ){
//                a = a/10;
//                j++;
//            }
//            if (j % 2 == 0) {
//                ans++;
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int[][] arr = new int[matrix[0].length][matrix.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = matrix[j][i];
//            }
//        }
//        return arr;
//    }
//}

//class Solution {
//    public List<Integer> addToArrayForm(int[] A, int K) {
//        int N = A.length;
//        int cur = K;
//        List<Integer> ans = new ArrayList();
//
//        int i = N;
//        while (--i >= 0 || cur > 0) {
//            if (i >= 0)
//                cur += A[i];
//            ans.add(cur % 10);
//            cur /= 10;
//        }
//
//        Collections.reverse(ans);
//        return ans;
//    }
//}

//class Solution {
//    public int maximumPopulation(int[][] logs) {
//        int[] years = new int[101];
//        for (int i = 0; i < logs.length; i++) {
//            years[logs[i][0] - 1950]++;
//            years[logs[i][1] - 1950]--;
//        }
//
//        int max = Integer.MIN_VALUE;
//        int curr = 0;
//        int ans = 0;
//
//        for (int i = 0; i < years.length; i++) {
//            curr += years[i];
//            if (curr > max) {
//                max = curr;
//                ans = i + 1950;
//            }
//        }
//        return ans;
//
//    }
//}

//


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length ; j++) {
//                if (nums[i] + nums[j] == target){
//                    ans[0] = i;
//                    ans[1] = j;
//                    return ans;
//                }
//            }
//        }
//        return ans;
//    }
//}


//class Solution {
//    public int[] sumZero(int n) {
//        int[] arr = new int[n];
//        if (n%2 != 0){
//            for (int i = 0; i <= n/2; i++) {
//                arr[n/2 + i] = i;
//                arr[n/2 - i] = -i;
//            }
//        } else {
//            for (int i = 1; i <= n/2; i++) {
//                arr[n/2 -1 +i] = i;
//                arr[n/2 - i] = -i;
//            }
//        }
//        return arr;
//
//
//    }
//}


//class Solution {
//    public List<Integer> luckyNumbers (int[][] matrix) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < matrix.length; i++) {
//            int min = Integer.MAX_VALUE;
//            int minvalue = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] < min ){
//                    min = matrix[i][j];
//                    minvalue = j;
//                }
//
//            }
//            boolean isLucky = true;
//            for (int k = 0; k < matrix.length; k++) {
//                if ( matrix[k][minvalue] > matrix[i][minvalue]) {
//                    isLucky = false;
//                    break;
//                }
//            }
//            if (isLucky) {
//                ans.add(matrix[i][minvalue]);
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public int maxSubArray(int[] nums) {
//        int totalMax = nums[0];
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//            totalMax = Math.max(sum,totalMax);
//            sum = Math.max(sum,0);
//        }
//        return totalMax;
//    }
//}


//class Solution {
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        A
//    }
//
//}

//class Solution {
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
////if r,c same as original OR rc != original matrix rowcol then return mat
//        if ((mat.length == r && mat[0].length == c) || ((r * c) != (mat.length * mat[0].length)))
//            return mat;
//
//        //store all mat elements serially in arraylist
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[0].length; j++) {
//                arr.add(mat[i][j]);
//            }
//        }
//        //add arraylist element in ret[]
//        int[][] ret = new int[r][c];
//        int k = 0;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                ret[i][j] = arr.get(k);
//                k++;
//            }
//        }
//
//        return ret;
//
//    }
//}


//class Solution {
//    public int[] plusOne(int[] digits) {
//        boolean a = true;
//        for (int i = 0; i < digits.length; i++) {
//            if (digits[i] !=9) {
//                a = false;
//                break;
//            }
//        }
//        if (a) {
//            int[] arr = new int[digits.length+1];
//            arr[0] = 1;
//            for (int i = 1; i < arr.length ; i++) {
//                arr[i] = 0;
//            }
//            return arr;
//        } else {
//            int[] arr = new int[digits.length];
//            for (int i = arr.length-1; i >=0 ; i--) {
//                if (digits[i] == 9) {
//                    arr[i] = 0;
//                }else {
//                    arr[i] = digits[i] + 1;
//                    for (int j = i-1; j >=0 ; j--) {
//                        arr[j] = digits[j];
//                    }
//                    break;
//                }
//
//            }
//            return arr;
//        }
//
//    }
//}


//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int prev = Integer.MIN_VALUE;
//
//    }
//}