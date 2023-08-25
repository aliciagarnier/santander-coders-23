package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ordenacao {


    public static void main(String[] args) {

        List<String> listaStrings = new ArrayList<>(List.of("z", "a", "w", "d", "e", "b", "f", "x", "c", "y"));

        for (int i = 0; i < listaStrings.size(); i++) {

            int menor = i;
            String aux = listaStrings.get(i);

            for (int j = i + 1; j < listaStrings.size(); j++)
            {
                int comparaStrings = listaStrings.get(menor).compareTo(listaStrings.get(j));

                if (comparaStrings > 0)
                {
                    menor = j;
                }

            }

            listaStrings.set(i, listaStrings.get(menor));
            listaStrings.set(menor, aux);

        }

        System.out.println(listaStrings);
    }
}
