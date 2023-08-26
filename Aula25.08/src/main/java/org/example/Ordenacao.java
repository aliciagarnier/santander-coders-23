package org.example;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {


    // Imprimir a lista de string ordenadas
    public static void main(String[] args) {

        List<String> listaStrings = new ArrayList<>(List.of("z", "a", "f"));
        listaStrings.add("c");
        Collections.sort(listaStrings);
        System.out.println(listaStrings);
//
        Integer vinteECinco = 25;
        Integer cinquenta = 50;
        Integer dez = 10;
        List<Integer> listaNumeros = new ArrayList<>(List.of(vinteECinco, cinquenta, dez));
        System.out.println("Lista desornenada %s".formatted(listaNumeros));
        Collections.sort(listaNumeros);
        System.out.println("Lista ornenada %s".formatted(listaNumeros));

        System.out.println("10.compareTo(25) == %s".formatted(dez.compareTo(vinteECinco)));
        System.out.println("25.compareTo(10) == %s".formatted(vinteECinco.compareTo(dez)));
        System.out.println("10.compareTo(10) == %s".formatted(dez.compareTo(dez)));


        List<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa vini = new Pessoa("Vini", LocalDate.of(1922, Month.DECEMBER, 15));
        Pessoa amanda = new Pessoa("Amanda", LocalDate.of(2003, Month.APRIL, 12));
        Pessoa zed = new Pessoa("Zed", LocalDate.of(1999, Month.JANUARY, 20));

        listaPessoas.addAll(List.of(zed, amanda, vini));
        System.out.println("Lista de pessoas desornenada %s".formatted(listaPessoas));
        Collections.sort(listaPessoas);
        System.out.println("Lista de pessoas ordenada %s".formatted(listaPessoas));



    }
}

