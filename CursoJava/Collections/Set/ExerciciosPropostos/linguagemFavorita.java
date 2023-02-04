package Collections.Set.ExerciciosPropostos;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    a) Ordem de inserção;
    b) Ordem natural(nome);
    c) IDE;
    d) Ano de criação e nome;
    e) Nome, ano de criação e IDE;
    Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class linguagemFavorita {
    public static void main(String[] args) {
        System.out.println("--- Ordem inserção ---");
        Set<Linguagem> minhasLinguagensFavoritas = new LinkedHashSet<>() {
            {
                add(new Linguagem("C#", 2002, "Visual Studio"));
                add(new Linguagem("Java", 1991, "Eclipse"));
                add(new Linguagem("Python", 1989, "PyCharm"));
            }
        };
        for (Linguagem linguagem : minhasLinguagensFavoritas) {
            System.out.println(linguagem);
        }

        System.out.println("--- Ordem natural: nome ---");
        Set<Linguagem> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (Linguagem linguagem : minhasLinguagensFavoritas2) {
            System.out.println(linguagem);
        }

        System.out.println("--- Ordem IDE ---");
        Set<Linguagem> minhasLinguagensFavoritas3 = new TreeSet<Linguagem>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (Linguagem linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        System.out.println("--- Ordem Ano de Criacao e Nome ---");
        Set<Linguagem> minhasLinguagensFavoritas4 = new TreeSet<Linguagem>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (Linguagem linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--- Ordem Nome - Ano de Criacao - IDE ---");
        Set<Linguagem> minhasLinguagensFavoritas5 = new TreeSet<Linguagem>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (Linguagem linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

    }
}

class Linguagem implements Comparable<Linguagem> {
    private String nome;
    private Integer anoCriacao;
    private String IDE;

    public Linguagem(String nome, Integer anoCriacao, String IDE) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer GetAnoCriacao() {
        return anoCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano de criação='" + anoCriacao + '\'' +
                ", IDE=" + getIDE() +
                '}';
    }

    @Override
    public int compareTo(Linguagem linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem that = (Linguagem) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem lf1, Linguagem lf2) {
        return lf1.getIDE().compareToIgnoreCase(lf2.getIDE());
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem lf1, Linguagem lf2) {
        int anoDeCriacao = Integer.compare(lf1.GetAnoCriacao(), lf2.GetAnoCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem lf1, Linguagem lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.GetAnoCriacao(), lf2.GetAnoCriacao());
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getIDE().compareToIgnoreCase(lf2.getIDE());
    }
}

