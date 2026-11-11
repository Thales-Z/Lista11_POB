package lista11_pob;

import java.util.HashSet;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<Integer> turmaA = new HashSet<>();
        turmaA.add(101);
        turmaA.add(102);
        turmaA.add(103);

        Set<Integer> turmaB = new HashSet<>();
        turmaB.add(102);
        turmaB.add(103);
        turmaB.add(104);

        Set<Integer> uniao = new HashSet<>(turmaA);
        uniao.addAll(turmaB);
        System.out.println("União (Todas as matrículas): " + uniao);

        Set<Integer> intersecao = new HashSet<>(turmaA);
        intersecao.retainAll(turmaB);
        System.out.println("Interseção (Ambas as turmas): " + intersecao);
    }
}
