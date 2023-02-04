package basicoJava.operadores;

public class unarios {
    public static void main(String[] args) {
        
        int numero = 5;
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        System.out.println("-------------------");

        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);
        System.out.println(--numero);

        System.out.println("-------------------");

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(!variavel);
        System.out.println(variavel);
    }
}
