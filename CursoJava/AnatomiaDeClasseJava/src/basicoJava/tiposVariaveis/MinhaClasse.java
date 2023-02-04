package basicoJava.tiposVariaveis;

public class MinhaClasse {
    public static void main(String[] args) {

        System.out.println("Hello class!!");

        int numero$1 = 1;
        int numero1 = 1;
        int numeroUm = 1;
        int longo = 1;

        String nome = "Andre";
        boolean year2022 = true;
        longo = 2;

        String firstName = "André";
        String secondName = "Storti";

        String completeName = completeName(firstName, secondName);
        System.out.println(completeName);

    }

    public static String completeName(String firstName, String SecondName) {
        return firstName.concat(" ").concat(SecondName);
    }
}