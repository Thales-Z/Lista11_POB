package lista11_pob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = sc.nextLine().toLowerCase();

        String[] palavras = texto.split("\\s+");
        Map<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}
