package com.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        armstrong();

//        int num = input.nextInt();
//        System.out.println(isPrime(num));
    }


//    static boolean isPrime(int a) {
//        if ( a <= 1){
//            return false;
//        }
//        int i = 2;
//        while (i*i <= a) {
//            if ( a % i == 0) {
//                return false;
//            }
//            i++;
//        }
//        return i*i > a;
//    }

    static void armstrong () {

        for (int i = 100; i < 1000 ; i++) {

            int sum = 0;
            int rem = 0;
            int checkNum = i;
            while (checkNum != 0) {
                rem = checkNum % 10;
                sum = sum + rem*rem*rem;
                checkNum = checkNum/10;
            }

            if (sum == i) {
                System.out.println(sum);
            }

        }
    }
}
