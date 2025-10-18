package org.example;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
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
}
