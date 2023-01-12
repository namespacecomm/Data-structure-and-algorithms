//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//
//        int arr[] = new int[t];
//        for (int i = 0; i < t; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        for (int l = 0; l < t; l++) {
//            int n = arr[l];
//
//            for (int i = 1; i <= n ; i++) {
//                for (int j = 1; j <= n ; j++) {
//                    int k = i + j;
//                    if (k < (n/2)+2) {
//                        System.out.print("*");
//                    } else if (k > (n/2)*3 + 2) {
//                        System.out.print("*");
//                    } else if (k > ((n / 2)+2) + ((i-1)*2)) {
//                        System.out.print("*");
//                    }else if (k > ((n / 2)+2) + ((j-1)*2)) {
//                        System.out.print("*");
//                    }else {
//                        System.out.print("D");
//                    }
//                }
//                System.out.println();
//            }
//        }
//
//    }
//}


//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner input = new Scanner(System.in);
//
//        int t = input.nextInt();
//
//        int[] matches = new int[t];
//        String[] list = new String[t];
//
//        for (int i = 0; i < t; i++) {
//            matches[i] = input.nextInt();
//            list[i] = input.next();
//        }
//
//        for (int i = 0; i < t; i++) {
//            int count = 0;
//            for (int j = 0; j < matches[i]; j++) {
//
//                if (list[i].charAt(j) == 'P') {
//                    count++;
//                }
//            }
//
//            if (count > matches[i]/2) {
//                System.out.println("Prishita");
//            } else if (count == matches[i]/2) {
//                System.out.println("Friendship");
//            } else {
//                System.out.println("Isha");
//            }
//
//
//        }
//    }
//}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    }
}