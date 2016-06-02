/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.v;

import java.util.Scanner;

/**
 *
 * @author Abhash
 */
public class Vowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter the String:");
            String a = input.nextLine();
            char d;
            int b, v = 0, x = 0;
            int c = a.length();
            for (b = 0; b <= c - 1; b++) {
                d = a.charAt(b);
                if (d == 'a' || d == 'A' || d == 'e' || d == 'E' || d == 'i' || d == 'I' || d == 'o' || d == 'O' || d == 'u' || d == 'U') {
                    v++;
                } else {
                    x++;
                }
            }
            System.out.println("The no of vowels are" + v);
            System.out.println("the no of consonants are" + x);

            System.out.println("Do you want to continue[Y/N]");
            String ch = input.nextLine();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
