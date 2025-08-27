public class Radar {

    public Integer limiteVelocidade;
    public String modelo;
    public String localicacao;

    public void emitirNotificação(String placa, Integer 
    velocidadeAvaliada){
        System.out.println("limite de velocidade" + this.limiteVelocidade);
        System.out.println("Velocidade avaliada:" + velocidadeAvaliada);
        System.out.println("Placa:"+placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.velocidade > this.limiteVelocidade) {

            emitirNotificação(c.placa, c.velocidade);
            
        }
    }

}