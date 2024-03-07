package org.company;

import java.util.Scanner;

public class StringCorrect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String message = scanner.nextLine();

        // Correct the string (assuming "worst" appears only once)
        String correctedMessage = message.replace("worst", "best");

        // Print the corrected sentence
        System.out.println("Corrected sentence: " + correctedMessage);
    }
}
