package com.vaibhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

//        System.out.println("value 1 ");
//        int value1 = input.nextInt();
//        System.out.println("value 2 ");
//        float value2 = input.nextInt();
//        System.out.println("value 3 ");
//        float value3 = input.nextInt();
//
//        double semiArea = (value3 + value2 + value1) * 0.5;
//        double a = Math.sqrt(value1);
//        System.out.println(a);

//        class Solution {
//            public int subtractProductAndSum(int n) {
//                int dig, sum = 0;
//                int prod = 1;
//                int i = n;
//                while (i != 0) {
//                    dig = i % 10;
//                    sum = sum + dig;
//                    prod = prod * dig;
//                    i = i / 10 ;
//                }
//                int res = prod - sum;
//                return res;
//
//            }
//        }

//        System.out.println("enter num");
//        long intEntered = input.nextLong();
//
//
//        long c, i = 0;
//        while (intEntered != 0) {
//            c = intEntered % 10 ;
//            i = (i * 10) + c;
//            intEntered = intEntered / 10 ;
//        }
//
//        System.out.println(i);

//        long n = 4;
//        long a = 1;
//        for (long i = 1; i <= n; i++ ) {
//            a = a * i;
//        }
//        System.out.println(a);
//
//        System.out.println("enter num");
//        int num = input.nextInt();
//        System.out.println();
//        System.out.println("factors");
//        for (int i = 1; i <= num; i++ ) {
//            if ( num % i == 0) {
//                System.out.println(i);
//            }
//        }
//        int i = 1;
//        int sum = 0;
//        do {
//            System.out.print("enter a number: ");
//            i = input.nextInt();
//            sum = sum + i ;
//        } while (i != 0);
//
//        System.out.println("sum is " + sum);


//        int maxInt = 0;
//        int i = 1;
//
//        do {
//            System.out.print("enter a number: ");
//            i = input.nextInt();
//
//            if (i > maxInt) {
//                maxInt = i;
//            }
//
//        } while (i != 0);
//
//        System.out.println("max is " + maxInt);



//        int factNum = input.nextInt();
//        long factorial = 1;
//
//        for (int i =1; i <= factNum; i++) {
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);

//
//        int sum = 0;
//        int i = 1;
//        int dig = 0;
//
//         do{
//            System.out.print("enter a number: ");
//            i = input.nextInt();
//
//            sum = sum + i;
//            if (i !=0 ) dig++;
//        } while (i != 0);
//
//        int avg = sum / dig;
//
//
//        System.out.println("avg is " + avg);
//
//        float mp = 550;
//        float sp = 420;
//
//        float discount = ( mp - sp )/mp * 100;
//        System.out.println(discount);

//        System.out.println("enter number");
//        long num = input.nextInt();
//
//        System.out.println("enter power");
//        long pow = input.nextInt();
//
//        long sum = 1;
//        for ( int i = 1 ; i <= pow ; i++) {
//            sum = sum * num;
//        }
//
//        System.out.println(sum);

//        double p = 450000;
//        double r = 10;
//        double t = 20;
//        double amount = p;
//        for ( int i = 1 ; i <= t ; i++) {
//            amount = amount + (amount * r / 100);
//        }
//        System.out.println(amount);

//        int n = 19;
//        int r = 4;
//        int m = n - r;
//
//        double factorialOfN = 1;
//
//        for (int i = 1; i <= n; i++) {
//            factorialOfN = factorialOfN * i;
//        }

//
//        double factorialOfR = 1;
//
//        for (int j = 1; j <= r; j++) {
//            factorialOfR = factorialOfR * j;
//        }
//
//
//        double factorialOfM = 1;
//
//        for (int k = 1; k <= m; k++) {
//            factorialOfM = factorialOfM * k;
//        }
//
//        double NCR = (factorialOfN / factorialOfR) / factorialOfM;
//        double NPR = factorialOfN / factorialOfM;
//
//        System.out.println("ncr");
//        System.out.println(NCR);
//        System.out.println("npr");
//        System.out.println(NPR);



//        String name = input.next();
//        int length = name.length();
//        System.out.println(length);
//
//        String newString = "";
//        for ( int i = 1 ; i <= length ; i++) {
//            newString = newString + name.charAt(length - i);
//        }
//        System.out.println(newString);


//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int hcf = 0;
//
//        for (int i = 1 ; (i <= num1) && (i <= num2) ; i++) {
//            if ( (num1 % i == 0) && (num2 % i == 0) ) {
//                hcf = i;
//            }
//        }
//
//        System.out.println("hcf is " + hcf);
//
//        int lcm = 0;
//
//        int j = Math.max(num1, num2);
//        while ( (j >= num1) && (j >= num2) ) {
//            if ( (j % num1 == 0) && (j % num2 == 0) ) {
//                lcm = j;
//                break;
//            } else {
//                j++;
//            }
//        }
//
//        System.out.println("lcm is " + lcm);


//
//        System.out.println("enter num");
//        int num = input.nextInt();
//        System.out.println();
//
//        int sum = 0;
//        System.out.println("factors");
//        for (int i = 1; i < num; i++ ) {
//            if ( num % i == 0) {
//                System.out.println(i);
//                sum = sum +i;
//            }
//        }
//
//        if (sum == num) {
//            System.out.println("perfect num");
//        } else {
//            System.out.println("not perfect");
//        }

//        int n = 0;
//        int posEven = 0;
//        int posOdd = 0;
//        int neg = 0;
//        do {
//            System.out.print("enter num ");
//            n = input.nextInt();
//
//            if (n > 0 && n % 2 == 0) {
//                posEven = posEven + n;
//            } else if (n > 0) {
//                posOdd = posOdd + n;
//            } else if (n < 0) {
//                neg = neg + n;
//            } else {
//                break;
//            }
//        } while (true);
//
//        System.out.println(posOdd);
//        System.out.println(posEven);
//        System.out.println(neg);

        // Taking input of two number

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
