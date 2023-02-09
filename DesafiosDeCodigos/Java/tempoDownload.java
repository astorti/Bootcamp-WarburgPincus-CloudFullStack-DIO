

public class tempoDownload {
    public static void main(String[] args) {
        
        float Mb = 80;
        float Mbps = 60;
        double conversaoMbParaMbps = Mbps / 8;
        double tempo = (Mb / conversaoMbParaMbps);
        tempo = tempo / 600;
        System.out.printf("%.2f", tempo);

    }
}
