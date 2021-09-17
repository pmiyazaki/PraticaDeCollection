package Exercicio4;

import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<String> materiaisDeConstrucao = new HashSet<>();
        materiaisDeConstrucao.add("Cimento");
        materiaisDeConstrucao.add("Argamassa");
        materiaisDeConstrucao.add("Caibros");
        materiaisDeConstrucao.add("Cal");
        materiaisDeConstrucao.add("Pedras");
        materiaisDeConstrucao.add("Caminhão de água");
        materiaisDeConstrucao.add("Betoneira");
        materiaisDeConstrucao.add("Serviço de obras A - Arquiteto");
        materiaisDeConstrucao.add("Serviço de obras B - Chefe de obras");
        materiaisDeConstrucao.add("Serviço de obras C - Pedreiro");

        materiaisDeConstrucao.remove("Serviço de obras A - Arquiteto");
        materiaisDeConstrucao.remove("Argamassa");
        materiaisDeConstrucao.remove("Caminhão de água");

        for(String materiais:materiaisDeConstrucao) {
            System.out.println(materiais);
        }
    }
}
