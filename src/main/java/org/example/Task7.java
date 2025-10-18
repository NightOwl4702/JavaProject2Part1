package org.example;

public class Task7 {
    public static void main(String[] args) {
        String sample="#Night Owl 4702#";
        String[] words = sample.trim().split("[\\s\\p{Punct}]+");
        System.out.println("Number of words: " + words.length);
    }
}
