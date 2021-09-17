package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add("Laranja");
        listaDeProdutos.add("Mamão");
        listaDeProdutos.add("Biscoito");
        listaDeProdutos.add("Pururuca seca");
        listaDeProdutos.add("Pasta de dentes");


        listaDeProdutos.remove(1);
        listaDeProdutos.remove(2);

        for(String valorPesquisado:listaDeProdutos){
            System.out.println(valorPesquisado);
        }
    }
}
