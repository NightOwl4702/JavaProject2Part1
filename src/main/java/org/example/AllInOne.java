package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class AllInOne {
    public static void Task1 (){
        String a = "Syntax";
        String b = "Group3";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("The result: a = " + a + " , b = " + b);
    }


    public static void Task2 (){
        String sample="#NightOwl4702#";
        int count=0;

        for(char s:sample.toCharArray()){
            if (Character.isLetter(s)){
                count++;
            }
        }
        System.out.println("There are "+count+" alpha characters are present in a string.");
    }


    public static void Task3 (){
        String sample="#NightOwl4702#";
        String reversed= new StringBuilder(sample).reverse().toString();

        System.out.println("The reversed string is "+ reversed);
    }


    public static void Task4 (){
        String sample="Katak";
        String reversed = new StringBuilder(sample).reverse().toString();

        if(sample.equalsIgnoreCase(reversed))
            System.out.println(sample + " is a palindrome.");
        else
            System.out.println(sample + " is not a palindrome.");
    }


    public static void Task5 (){
        String sam1 = "rakebans";
        String sam2 = "nebraska";

        char[] arr1 = sam1.toCharArray();
        char[] arr2 = sam2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println(sam1 + " and "+ sam2 +" are anagrams");
        else
            System.out.println(sam1 + " and "+ sam2 +" are not anagrams");
    }


    public static void Task6 (){
        String sample="documentation";
        int count =0;

        for (char vowels : sample.toLowerCase().toCharArray()){
            if ("aeiouy".indexOf(vowels) != -1)
                count++;
        }
        System.out.println("Number of vowels: " + count);
    }


    public static void Task7 (){
        String sample="#Night Owl 4702#";
        String[] words = sample.trim().split("[\\s\\p{Punct}]+");
        System.out.println("Number of words: " + words.length);
    }


    public static void Task8 (){
        List<String> list = Arrays.asList("Mimin", "Amina", "Nigina", "Adham", "Mubin", "Akbar", "Aziza");

        List<String> result =  list.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }


    public static void Task9 (){
        String sample="#SinatraStrangersInTheNight#";
        Map<Character, Integer> map= new LinkedHashMap<>();

        for (char l : sample.toCharArray())
            map.put(l, map.getOrDefault(l,0)+1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: "+ entry.getKey());
                break;
            }
        }
    }


    public static void Task10 (){
        List<String> list = Arrays.asList("Amina","Mubin", "Amina", "Aziza", "Mimin", "Nigina", "Aziza");
        List<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("After removing duplicates: "+ uniqueList);
    }

}