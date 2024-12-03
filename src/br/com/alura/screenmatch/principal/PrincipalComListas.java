package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme OutroFilme = new Filme("Avatar",2023);
        OutroFilme.avalia(6);
        Filme filmeDoMatheus = new Filme("Dogville",2003);
        filmeDoMatheus.avalia(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoMatheus);
        lista.add(meuFilme);
        lista.add(OutroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação : " + filme.getClassificacao());
            }
        }

        //Filme f1 = filmeDoMatheus;


        //outra forma de usar o forEach
        //lista.forEach(nome -> System.out.println(nome));
        //OU
        //lista.forEach(System.out::println);

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Vim Disel");
        buscarPorArtista.add("Angelina Joeli");
        buscarPorArtista.add("Scarlety Johnrasson");

        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Ordenado: " + buscarPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de titutlos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano: " + lista);



    }
}
