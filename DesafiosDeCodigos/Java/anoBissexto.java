

public class anoBissexto {
    public static void main(String[] args) {
        
        int ano = 2023;
        String bissexto;

        if(ano % 400 == 0){
            bissexto = "Bissexto";
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            bissexto = "Bissexto";
        } else {
            bissexto = "Não Bissexto";
        }
        
        System.out.println(bissexto);
    }
}
