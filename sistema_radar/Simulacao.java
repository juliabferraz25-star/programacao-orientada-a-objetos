public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velocidade = 0;
        opala.placa = "ACRL300";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar();

        radar.modelo = "pardal";
        radar.limiteVelocidade = 60;
        radar.localicacao = "pistão sul";

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


        radar.avaliarVelocidade(opala);

        

        

        opala.frear();
        radar.avaliarVelocidade(opala);



    }
}
