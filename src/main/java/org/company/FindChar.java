package org.company;

import java.util.Scanner;

public class FindChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              System.out.print("Enter a string: ");
        String message = scanner.nextLine();


        if (message.length() > 6) {
            char charAt6 = message.charAt(6);
            System.out.println("The character at index 6 is: " + charAt6);
        } else {
            System.out.println("The string length is less than 7. Index 6 is out of bounds.");
        }
    }
}


