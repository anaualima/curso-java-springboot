public class Usuário {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv =  new SmartTv();



        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual (ligada?) -> " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.atualizarCanal(13);
        System.out.println("Canal atual " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual " + smartTv.canal);
    }
}
