package lista11_pob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Produto {
    String nome;
    String categoria;
    double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", "Informática", 3500.0));
        produtos.add(new Produto("Mouse", "Informática", 150.0));
        produtos.add(new Produto("Arroz", "Alimentos", 25.0));
        produtos.add(new Produto("Livro Java", "Livros", 80.0));

        Map<String, List<Produto>> agrupado = new HashMap<>();

        for (Produto p : produtos) {
            agrupado.putIfAbsent(p.categoria, new ArrayList<>());
            agrupado.get(p.categoria).add(p);
        }

        for (Map.Entry<String, List<Produto>> entry : agrupado.entrySet()) {
            System.out.println("Categoria: " + entry.getKey());
            for (Produto p : entry.getValue()) {
                System.out.println(" - " + p);
            }
        }
    }
}
