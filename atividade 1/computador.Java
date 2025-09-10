public class Computador{

    private Integer memoriaRam;
    private Integer SSD;
    private Integer Nucleos;
    private float operacoesporSegundo; 

    public Computador(int memoriaRam, int SSD, int Nucleos, float operacoesporSegundo) {
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.Nucleos = Nucleos;
        this.operacoesporSegundo = operacoesporSegundo;
    }

    public Integer getMemoriaram(){
        return this.memoriaRam;
    }

    public Integer getSSD(){
        return this.SSD;
    }

    public Integer getNucleos(){
        return this.Nucleos;
    }

    public float GetoperacoesporSegundo(){
        return this.operacoesporSegundo;
    }
    
    public void SetmemoriaRam( Integer memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    
    public void SetSSD( Integer SSD){
        this.SSD = SSD;
    }
    public void Setnucleos( Integer Nucleos){
        this.Nucleos = Nucleos;
    }
    public void SetoperacoesporSegundo( float operacoesporSegundo){
        this.operacoesporSegundo = operacoesporSegundo;
    }

}
