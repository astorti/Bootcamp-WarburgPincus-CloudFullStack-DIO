package Collections.List.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


/*
 * Faça um programa que recebe a temperatura média dos 6 primeiros meses do ano
 * e armazene-as em uma lista.
 * Após isto, calculo a média semestral das temperaturas e mostre todas as temperaturas
 * acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, etc).
 */

public class temperatura {
    public static void main(String[] args) {

        List<MediaMensalTemperatura> temperaturas = new ArrayList<>() {
            {
                add(new MediaMensalTemperatura("Janeiro", 32.4));
                add(new MediaMensalTemperatura("Fevereiro", 34.6));
                add(new MediaMensalTemperatura("Março", 33.4));
                add(new MediaMensalTemperatura("Abril", 28.5));
                add(new MediaMensalTemperatura("Maio", 31.4));
                add(new MediaMensalTemperatura("Junho", 19.9));
            }
        };

        Iterator<MediaMensalTemperatura> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            MediaMensalTemperatura next = iterator.next();
            soma += next.getTemperatura();
        }

        double media = soma / temperaturas.size();
        
        System.out.println("");
        System.out.println("Exiba a médias das temperaturas: " + media);
        
        double tempaturaMes = 0d;

        Iterator<MediaMensalTemperatura> iterator2 = temperaturas.iterator();

        System.out.println("Temperaturas acima da média: ");
        while (iterator2.hasNext()) {
            MediaMensalTemperatura next = iterator2.next();
            if (next.getTemperatura() > media) {
                tempaturaMes = next.getTemperatura();
                String mes = next.getMes();
                System.out.println(mes + ": " + tempaturaMes + "°C");
            }
        }
    }
}

class MediaMensalTemperatura implements Comparable<MediaMensalTemperatura>{
    private String mes;
    private double temperatura;
    
    public MediaMensalTemperatura(String mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    
    public double getTemperatura() {
        return temperatura;
    }

    
    @Override
    public int compareTo(MediaMensalTemperatura o) {        
        return 0;
    }
}
