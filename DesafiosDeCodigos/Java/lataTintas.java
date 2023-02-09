

public class lataTintas {
    public static void main(String[] args) {
        double areaCoberta = 200d;
        double lata = 18;
        double galao = 3.6;
        double coberturaTinta = 6;
        double quantidadeLatas = (areaCoberta / coberturaTinta) / lata;
        quantidadeLatas = Math.ceil(quantidadeLatas);
        double quantidadeGaloes = (areaCoberta / coberturaTinta) / galao;
        quantidadeGaloes = Math.ceil(quantidadeGaloes);
        double valorLata = 80.00;
        double valorGalao = 25.00;

        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata);
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }
}
