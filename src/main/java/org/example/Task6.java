package org.example;

public class Task6 {
    public static void main(String[] args) {
        String sample="documentation";
        int count =0;

        for (char vowels : sample.toLowerCase().toCharArray()){
            if ("aeiouy".indexOf(vowels) != -1)
                count++;
        }
        System.out.println("Number of vowels: " + count);
    }
}
