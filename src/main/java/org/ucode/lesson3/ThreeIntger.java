package org.ucode.lesson3;
//Write a Java program that accepts three integer values and return true
// if one of them is 20 or more and less than the substractions of others.

import java.util.Scanner;

public class ThreeIntger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second  number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number:");
        int c = scanner.nextInt();
        System.out.println(Math.abs(a-b)>=20||(Math.abs(b-c)>=20 ||Math.abs(c-a)>=20));
    }
}
