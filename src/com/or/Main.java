package com.or;

import java.util.Scanner;

public class Main {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        magazineCheck(6,4);

    }

    public static void magazineCheck(int m , int n) {

        String[] magazineSentence = new String[m];
        String[] noteSentence = new String[n];

        System.out.println("Please enter the sentence for the Magazine: ");
        SCANNER.nextLine();
        for (int i = 0; i < m; i++) {
            magazineSentence[i] = SCANNER.nextLine();

        }
        System.out.println("Please enter the sentence for the Note: ");
        for (int i = 0; i < n; i++) {
            noteSentence[i] = SCANNER.nextLine();
        }

        boolean[] b = new boolean[noteSentence.length];
        for (int i = 0; i < magazineSentence.length; i++) {
            for (int j = 0; j < noteSentence.length; j++) {
                if (magazineSentence[i].equals(noteSentence[j])) {
                    b[j] = true;
                }
            }
        }
        int trueCounter = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                trueCounter++;
            }
        }
        if (trueCounter == noteSentence.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
