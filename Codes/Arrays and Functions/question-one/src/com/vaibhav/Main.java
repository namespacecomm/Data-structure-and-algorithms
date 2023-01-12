package com.vaibhav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner input = new Scanner(System.in);

        // Odd even
//        System.out.println("enter num");
//        int checkNumber = input.nextInt();
//
//        int remainder = checkNumber % 2;
//
//        if (remainder == 0) {
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }

//        System.out.println("enter name");
//        String name = input.next();
//
//        System.out.println("hi " + name);

//        System.out.println("enter principal");
//        int principal = input.nextInt();
//
//        System.out.println("enter time");
//        int time = input.nextInt();
//
//        System.out.println("enter rate");
//        int rate = input.nextInt();
//
//        System.out.println("your interest is " + (principal*rate*time));

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("enter integer 1 ");
//        double num1 = input.nextInt();
//
//        System.out.println("enter num 2");
//        double num2 = input.nextInt();
//
//        System.out.println("enter operator");
//        String ope = input.next();
//
//        double output = 0;
//
//        if (ope.equals("+")) {
//            output = num1 + num2;
//        } else if (ope.equals("-")) {
//            output = num1 - num2;
//        } else if (ope.equals("*")) {
//            output = num1 * num2;
//        } else if (ope.equals("/")) {
//            output = num1 / num2;
//        } else {
//            System.out.println("get out");
//        }
//
//        System.out.println(output);


//        int a = 0;
//        int b = 1;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter n ");
//        int n = input.nextInt();
//
//        if (n >= 1) {
//            System.out.println(a);
//        }
//        if (n >= 2){
//            System.out.println(b);
//        }
//
//        int c = 0;
//
//
//        if (n >= 3) {
//            for (int i = 3; i <= n; i++){
//                c = a + b;
//                System.out.println(c);
//                a = b;
//                b = c;
//            }
//
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter string ");
//
//        String palStr = input.next();
//
//        StringBuffer checkStr = new StringBuffer(palStr);
//        checkStr.reverse();
//        String revStr = checkStr.toString();
//        System.out.println(checkStr);
//
//        if (palStr.equals(revStr)) {
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }

        // Taking input of two number
        Scanner input = new Scanner(System.in);
        System.out.println("enter num1");
        long num1 = input.nextInt();
        System.out.println("enter num2");
        long num2 = input.nextInt();

        // Running a loop between those two numbers
        for (long i = num1; i <= num2; i++ ) {

            // Initialising variables to use later
            long checkNum = 0;
            long sum = 0;
            long remainder = 0;
            long checkDigits = 0;

            // i is the number that we are checking wether its armstrong or not

            // variable to add power of digits
            checkNum = i ;

            while (checkNum != 0) {
                remainder = checkNum % 10;

                // Checking number of digits

                    // variable to count the number of digits
                    checkDigits = i;

                    // Variable to store number of digits
                    int numOfDigits = 0;

                    //Loop to check the number of digits
                    while( checkDigits != 0) {
                        numOfDigits++;
                        checkDigits = checkDigits/10;
                    }

                sum = (long) (sum + Math.pow(remainder, numOfDigits));
                checkNum = checkNum / 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }




    }
}
