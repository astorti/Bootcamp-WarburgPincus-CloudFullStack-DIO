package basicoJava.tiposVariaveis;

public class tiposPrimitivos {
    
    public static void main(String[] args) {
        
        byte idade = 123;
        short ano = 2022;
        int cep = 1234567;
        long cpf = 987654321L;
        float pi = 3.14F;
        double salario = 1275.33;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);

        System.out.println("----------------------");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        
        //Casting
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

    }
}
