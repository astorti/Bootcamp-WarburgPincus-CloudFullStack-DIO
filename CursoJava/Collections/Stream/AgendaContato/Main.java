package Collections.Stream.AgendaContato;

import java.util.*;

/*  Dadas as seguintes informações  de id e contato, crie um dicionário e
    ordene este dicionário exibindo (Nome id - Nome contato);
    id = 1 - Contato = nome: Simba, numero: 2222;
    id = 4 - Contato = nome: Cami, numero: 5555;
    id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contatos> agenda = new HashMap<>() {{
            put(1, new Contatos("Simba", 5555));
            put(4, new Contatos("Cami", 1111));
            put(3, new Contatos("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contatos> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contatos> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contatos("Simba", 5555));
            put(4, new Contatos("Cami", 1111));
            put(3, new Contatos("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contatos> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contatos> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contatos> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        
        // Método 1
        /*
            Set<Map.Entry<Integer, Contatos>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contatos>>() {
                @Override
                public int compare(Map.Entry<Integer, Contatos> cont1, Map.Entry<Integer, Contatos> cont2) {
                    return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
                }
            });
         */

        // Método 2
        /*
            Set<Map.Entry<Integer, Contatos>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contatos>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contatos> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
         */

        
        // Método 3 - Expressão Lambda
        Set<Map.Entry<Integer, Contatos>> set = new TreeSet<>(Comparator.comparing(
            cont -> cont.getValue().getNumero()));
    
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contatos> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        /*
            Set<Map.Entry<Integer, Contatos>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
            set1.addAll(agenda.entrySet());
            for (Map.Entry<Integer, Contatos> entry : set1) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
            } 
        */
        
        Set<Map.Entry<Integer, Contatos>> set1 = new TreeSet<>(Comparator.comparing(
            cont1 -> cont1.getValue().getNome()));
        
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contatos> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contatos>> {
    @Override
    public int compare(Map.Entry<Integer, Contatos> cont1, Map.Entry<Integer, Contatos> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}
