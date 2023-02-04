package TratamentoDeExcecoes;

import javax.swing.*;
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
    
            try{
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.print("Resultado: " + resultado);
                continueLooping = false;
            
                // Tratamento do unchecked exception
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro " + e.getMessage());
                
                // Tratamento do Arithmetic exception
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0 " + e.getMessage());
            } finally {
                System.out.println("Chegou no finally!");
            }    
        } while (continueLooping);

        System.out.println("O código continua...");
        
    }

    public static double dividir(Double a, Double b) {
        return a / b;
    }
}
