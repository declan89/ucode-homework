package org.ucode.lesson3;

import java.util.Scanner;

//Write a Java program that accepts two integer values between 25 to 75 and return true
// if there is a common digit in both numbers.
public class TwoIntger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first no:");
        int a = scanner.nextInt();
        System.out.print("enter the second no:");
        int b  = scanner.nextInt();
        System.out.println("Result: "+common_digit(a, b));
    }

    public static boolean common_digit(int p, int q) {
        if (p<25 || q>75)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
    }
    }


