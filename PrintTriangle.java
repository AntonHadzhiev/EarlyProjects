package com.company;

import java.util.Scanner;

public class PrintTriangle {

    public static void printCharacter(int count) {
        char c = 'a';
        for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            printCharacter(i);
        }
        for (int i = n - 1; i > 0; i--) {
            printCharacter(i);
        }


    }

}
