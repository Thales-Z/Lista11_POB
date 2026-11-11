package lista11_pob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        System.out.println("Digite 5 tarefas:");
        for (int i = 0; i < 5; i++) {
            tarefas.add(sc.nextLine());
        }

        System.out.print("Digite uma tarefa para verificar se existe: ");
        String busca = sc.nextLine();
        System.out.println("Existe? " + tarefas.contains(busca));

        System.out.print("Digite a tarefa ou índice para remover: ");
        String rem = sc.nextLine();
        if (tarefas.contains(rem)) {
            tarefas.remove(rem);
        } else {
            try {
                int idx = Integer.parseInt(rem);
                if (idx >= 0 && idx < tarefas.size()) {
                    tarefas.remove(idx);
                }
            } catch (NumberFormatException e) {
                System.out.println("Tarefa não encontrada.");
            }
        }

        Collections.sort(tarefas);
        System.out.println("Tarefas ordenadas: " + tarefas);
        sc.close();
    }
}
