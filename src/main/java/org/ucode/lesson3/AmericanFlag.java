package org.ucode.lesson3;

public class AmericanFlag {
    public static void main(String[] args) {
        String a1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String a2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(a1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(a2);
        }
    }
}
