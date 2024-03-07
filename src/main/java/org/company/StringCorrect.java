package org.company;

import java.util.Scanner;

public class StringCorrect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String message = scanner.nextLine();
        String correctedMessage = message.replace("worst", "best");
        System.out.println("Corrected sentence: " + correctedMessage);
    }
}
