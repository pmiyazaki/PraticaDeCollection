package Exercicio2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> listaDeComunicacao = new ArrayList<>();
        listaDeComunicacao.add("ALPHA");
        listaDeComunicacao.add("BRAVO");
        listaDeComunicacao.add("CHARLIE");
        listaDeComunicacao.add("DELTA");
        listaDeComunicacao.add("ECO");
        listaDeComunicacao.add("FOXTROT");
        listaDeComunicacao.add("GOLF");
        listaDeComunicacao.add("HOTEL");
        listaDeComunicacao.add("INDIA");
        listaDeComunicacao.add("JULIET");
        listaDeComunicacao.add("KILO");
        listaDeComunicacao.add("LIMA");
        listaDeComunicacao.add("MIKE");
        listaDeComunicacao.add("NOVEMBER");
        listaDeComunicacao.add("OSCAR");

        for(String lista:listaDeComunicacao){
            System.out.println(lista);
        }

        listaDeComunicacao.remove(0);
        listaDeComunicacao.remove(0);
        listaDeComunicacao.remove(0);
        listaDeComunicacao.remove(0);
        listaDeComunicacao.remove(0);

        for(String novaLista:listaDeComunicacao){
            System.out.println(novaLista);
        }


    }
}
