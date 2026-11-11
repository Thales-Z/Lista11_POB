package lista11_pob;

import java.util.HashMap;
import java.util.Map;

class ControleEstoque {
    private Map<String, Integer> estoque = new HashMap<>();

    public void inserirProduto(String codigo, int quantidade) {
        estoque.put(codigo, quantidade);
    }

    public void atualizarEstoque(String codigo, int quantidade) {
        if (estoque.containsKey(codigo)) {
            int atual = estoque.get(codigo);
            estoque.put(codigo, atual + quantidade);
        }
    }

    public void exibirAlerta(int limite) {
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            if (entry.getValue() < limite) {
                System.out.println("Produto: " + entry.getKey() + " | Estoque: " + entry.getValue());
            }
        }
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        ControleEstoque sistema = new ControleEstoque();
        sistema.inserirProduto("P01", 10);
        sistema.inserirProduto("P02", 3);
        sistema.inserirProduto("P03", 0);

        sistema.atualizarEstoque("P02", -1);
        sistema.exibirAlerta(5);
    }
}
