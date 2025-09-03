public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300",0, 76, "Comodoro");
        

        Radar radar = new Radar("pistão sul", 60);

        radar.avaliarVelocidade(opala);

        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.setVelocidade(-60);


        radar.avaliarVelocidade(opala);

        

        

        opala.frear();
        radar.avaliarVelocidade(opala);



    }
}
