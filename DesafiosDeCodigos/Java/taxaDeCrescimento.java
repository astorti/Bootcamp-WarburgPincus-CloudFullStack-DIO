

public class taxaDeCrescimento {
    public static void main(String[] args) {
        
        double A, B;
        int anos = 0;

        A = 80000;
        B = 100000;

        while (A < B) {
            A = A * 1.03;
            B = B * 1.015;
            anos++;
        }

        System.out.println(anos + " anos");
    }
}
