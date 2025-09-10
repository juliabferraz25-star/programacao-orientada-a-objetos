public class programa{
    private Integer memoriaRamlocada;
    private Integer SSDOcupado;
    private Integer Nucleos;
    private Integer quantidadedeOperacoes;
    
    public programa(Integer memoriaRamlocada,Integer SSDOcupado, Integer Nucleos, 
    Integer quantidadedeOperacoes){
        this.memoriaRamlocada = memoriaRamlocada;
        this.SSDOcupado = SSDOcupado;
        this.Nucleos = Nucleos;
        this.quantidadedeOperacoes = quantidadedeOperacoes;
    }

    public Integer getMemoriaramlocada(){
        return this.memoriaRamlocada;
    }
    
    public void setMemoriaramlocada( Integer memoriaRamlocada){
        this.memoriaRamlocada = memoriaRamlocada;
    }


    public Integer getSSDOcupado(){
        return this.SSDOcupado;
    }
     public void setSSDOCUPADO( Integer SSDOcupado){
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getNucleos1(){
        return this.Nucleos;
    }
    
     public void setNucleos1( Integer Nucleos){
        this.Nucleos = Nucleos;
    }
    
    public Integer getQuatidadedeOperacoes(){
        return.quantidadedeOperacoes;
    }
     public void setQuqantidadedeOperacoes( Integer quantidadedeOperacoes){
        this.quantidadedeOperacoes = quantidadedeOperacoes;
    }
