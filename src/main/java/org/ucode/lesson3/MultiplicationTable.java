package org.ucode.lesson3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the data :");
        int n = scanner.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(n + " x " + (i+1) + " = " +
                    (n * (i+1)));
        }
    }
}
