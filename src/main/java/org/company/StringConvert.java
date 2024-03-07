package org.company;

import java.util.Scanner;

public class StringConvert {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a string: ");
        String message = scanner.nextLine();

        String lowercase = message.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        String uppercase = lowercase.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
    }
}
