package Exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<String> listaDeDoacao = new HashSet<>();

        listaDeDoacao.add("Arroz");
        listaDeDoacao.add("Feijão");
        listaDeDoacao.add("Macarrão");
        listaDeDoacao.add("Sal");
        listaDeDoacao.add("Açúcar");

        listaDeDoacao.add("Cobertor");
        listaDeDoacao.add("Gorro");
        listaDeDoacao.add("Meia");
        listaDeDoacao.add("Moletom");
        listaDeDoacao.add("Luvas");

        listaDeDoacao.remove("Açucar");
        listaDeDoacao.remove("Gorro");

        for(String novaLista:listaDeDoacao){
            System.out.println(novaLista);
        }

    }
}
