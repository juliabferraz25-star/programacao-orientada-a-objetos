public class Radar {

    public Integer limiteVelocidade;
    public String localicacao;

    public Radar(String localicacao, Integer limiteVelocidade){

        this.localicacao = localicacao;
        this.limiteVelocidade = limiteVelocidade;

    }

    public Radar(Integer limiteVelocidade){

        this.limiteVelocidade = limiteVelocidade;

    }

    public void emitirNotificação(String placa, Integer 
    velocidadeAvaliada){
        System.out.println("limite de velocidade" + this.limiteVelocidade);
        System.out.println("Velocidade avaliada:" + velocidadeAvaliada);
        System.out.println("Placa:"+placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.getVelocidade() > this.limiteVelocidade) {

            emitirNotificação(c.getPlaca(), c.getVelocidade());
            
        }
    }

}