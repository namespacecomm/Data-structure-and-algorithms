package com.vaibhav;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println(maxMin(13,16,20));
    }

    static boolean maxMin(int num1, int num2, int num3) {
        int max = Math.max(num3 , Math.max(num2, num1));

        if (max == num1) {
            return (num1 * num1) == ((num2 * num2) + (num3 * num3));
        } else if (max == num2) {
            return (num2 * num2) == ((num1 * num1) + (num3 * num3));
        } else if (max == num3) {
            return (num3 * num3) == ((num1 * num1) + (num2 * num2));
        }
        return false;
    }

    static String oddEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    static boolean voting(int age) {
        return age > 18;
    }

    static int sum( int num1, int num2) {
        return num1 + num2;
    }

    static void listPrime(int num1,int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);


        for (int i = min; i <= max ; i++) {
            boolean b = true;
            if (i <= 1) b = false;

            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println(i);
            }

        }
    }


    static int sumOfN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static boolean palindrome(int num) {
        int a = 0;
        int b = 1;

        int temp = 0;
        while (temp <= num) {
            temp = a + b;
            a = b;
            b =  temp;
            System.out.println(temp);
            if (num == temp) {
                return true;
            }
        }
        return false;
    }




}


