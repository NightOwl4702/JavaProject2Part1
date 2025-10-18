package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amina","Mubin", "Amina", "Aziza", "Mimin", "Nigina", "Aziza");
        List<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("After removing duplicates: "+ uniqueList);
    }
}
