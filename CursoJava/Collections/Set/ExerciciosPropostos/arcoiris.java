package Collections.Set.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
*/

public class arcoiris {
    public static void main(String[] args) {
        
        System.out.println("--- Crie um conjunto contendo as cores do arco-iris --- ");
        Set<String> cores = new LinkedHashSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            System.out.println(cor);
        }

        System.out.println("--- A quantidade de cores que o arco-íris tem --- ");
        Integer quantidadeCores = cores.size();
        System.out.println(quantidadeCores);

        System.out.println("--- Exiba as cores em ordem alfabética ---");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("--- Exiba as cores na ordem inversa da que foi informada ---");
        List<String> coresInvertidas = new ArrayList<>(cores);
        Collections.reverse(coresInvertidas);
        System.out.println(coresInvertidas);

        System.out.println("--- Exiba todas as cores que começam com a letra 'v' ---");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("--- Remova todas as cores que não começam com a letra 'v' ---");
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(cores);

        System.out.println("--- Limpe o conjunto ---");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}
