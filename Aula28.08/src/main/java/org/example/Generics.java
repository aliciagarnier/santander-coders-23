package org.example;

public class Generics {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println("Maior entre a e b: " + maior(a, b));
    }

    private static String maior(String primeira, String segunda) {

        int comparaStrings = primeira.compareTo(segunda);

        if (comparaStrings > 0)
        {
            return primeira;
        }

        return segunda;

    }
}