public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void auentarVolume() {
        volume++;
        System.out.println("volume " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("volume " + volume);
    }

    public void umentarCanal() {
        canal++;
        System.out.println("canal " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("canal " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("canal " + novoCanal);
    }
}
