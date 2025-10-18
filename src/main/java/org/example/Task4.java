package org.example;

public class Task4 {
    public static void main(String[] args) {
        String sample="Katak";
        String reversed = new StringBuilder(sample).reverse().toString();

        if(sample.equalsIgnoreCase(reversed))
            System.out.println(sample + " is a palindrome.");
        else
            System.out.println(sample + " is not a palindrome.");
    }
}
