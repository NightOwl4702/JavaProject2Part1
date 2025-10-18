package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mimin", "Amina", "Nigina", "Adham", "Mubin", "Akbar", "Aziza");

        List<String> result =  list.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
