package basicoJava.operadores;

public class operadoresRelacionais {
    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numeroUm é maior ou igual que numeroDois? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numeroUm é menor ou igual a numeroDois? " + simNao);
    }
}
