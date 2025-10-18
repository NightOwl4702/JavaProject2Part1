package org.example;

public class Task2 {
    public static void main(String[] args) {
        String sample="#NightOwl4702#";
        int count=0;

        for(char s:sample.toCharArray()){
            if (Character.isLetter(s)){
                count++;
            }
        }
        System.out.println("There are "+count+" alpha characters are present in a string.");
    }
}
