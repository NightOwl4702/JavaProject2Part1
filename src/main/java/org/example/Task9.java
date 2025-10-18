package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {
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
}
