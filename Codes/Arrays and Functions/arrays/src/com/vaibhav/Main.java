package com.vaibhav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int num: arr) {
            System.out.println(num);
        }

        System.out.println(Arrays.toString(arr));

    }

}
