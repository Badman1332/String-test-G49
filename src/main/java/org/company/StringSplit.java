package org.company;

public class StringSplit {

    public static void main(String[] args) {
        String names_string = "  Carl,Susie,Fredrick,Bob,Erik  ";

        String[] names_list = names_string.split(",");

        for (String name : names_list) {
            System.out.println(name.trim());
        }
    }
}







