package org.company;



import java.util.Scanner;

    public class StringSub {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                       System.out.print("Enter a string: ");
            String message = scanner.nextLine();

                       int startIndex = message.indexOf("not") + 4;
            int endIndex = message.lastIndexOf("!");

                        if (message.contains("not as long")) {
                String substring = message.substring(message.indexOf("not as long"));
                System.out.println("The substring is: " + substring);
            } else {
                System.out.println("The phrase 'not as long' could not be found.");
            }

        }
        }





