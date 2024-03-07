package org.company;



import java.util.Scanner;

    public class StringLength {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String message = scanner.nextLine();

            int length = message.length();
            System.out.println("The length of the string is: " + length);
        }
    }


