package Collections.List.ExerciciosAula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class metodosList {
    public static void main(String[] args) {
        
        // Dada uma lista com 7 notas de um aluno [ 7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("");
        int posicaoNotaCinco = notas.indexOf(5d);
        System.out.println("Exiba a posição da no 5.0: " + posicaoNotaCinco);

        System.out.println("");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Confira se a nota 5.0 está na lista: ");
        boolean notaCincoNaLista = notas.contains(5d);
        System.out.println(notaCincoNaLista);

        System.out.println("");
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);    
        }
        
        System.out.println("");
        System.out.println("Exiba a terceira nota adicionada: ");
        double terceiraNotaAdcionada = notas.get(2);
        System.out.println(terceiraNotaAdcionada);
        
        System.out.println("");
        System.out.println("Exiba a menor nnota: ");
        double menorNota = Collections.min(notas);
        System.out.println(menorNota);

        System.out.println("");
        System.out.println("Exiba a maior nnota: ");
        double maiorNota = Collections.max(notas);
        System.out.println(maiorNota);

        System.out.println("");
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("");
        System.out.println("Exiba a médias das notas: ");
        System.out.println(soma / notas.size());

        System.out.println("");
        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("");
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("");
        System.out.println("Confirme se a lista esta vazia");
        boolean estaVazia = notas.isEmpty();
        System.out.println(estaVazia);
    }

    
}
