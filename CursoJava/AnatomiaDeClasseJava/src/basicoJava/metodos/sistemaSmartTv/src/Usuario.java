public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        
        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(11);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.auentarVolume();
    }
}
