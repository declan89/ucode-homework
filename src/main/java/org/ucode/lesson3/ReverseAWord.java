package org.ucode.lesson3;

import java.util.Scanner;

public class ReverseAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word: "   );
        String Word = scanner.nextLine();
        Word = Word.trim();
        String result = "";
        char[] ch=Word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Reverse word: "+result.trim());
    }
}

