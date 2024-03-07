package org.company;

public class StringOilWater {


        public static void main(String[] args) {

            String originalString = "Oil and Water";

            String[] words = originalString.split(" ");


            for (String word : words) {
                System.out.println(word);
            }

        }




}
