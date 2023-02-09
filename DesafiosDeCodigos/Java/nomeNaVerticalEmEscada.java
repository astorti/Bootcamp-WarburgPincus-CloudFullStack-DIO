

public class nomeNaVerticalEmEscada {
    public static void main(String[] args) {
        String palavra = "Linguagem programacao java";
        String vertical = "";

        for (int i = 0; i < palavra.length(); i++) {
            vertical = vertical + palavra.charAt(i);
            System.out.println(vertical);
        }
    }
}
