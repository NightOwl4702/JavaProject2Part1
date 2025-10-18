package org.example;

public class Task1 {
    public static void main(String[] args) {
        String a = "Syntax";
        String b = "Group3";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("The result: a = " + a + " , b = " + b);

    }
}
