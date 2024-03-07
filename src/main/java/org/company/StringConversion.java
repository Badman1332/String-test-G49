package org.company;

public class StringConversion {

    public static void main(String[] args) {
        String originalString = "ThisShouldBeConverted";

               String uppercaseString = originalString.toUpperCase();

        System.out.println(uppercaseString);

        char[] charArray = uppercaseString.toCharArray();
        for (char character : charArray) {
            System.out.println(character);
        }
    }
}
