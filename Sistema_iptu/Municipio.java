package Sistema_iptu;

public class Municipio {

    private String Nome;
    private String Estado;
    private double precoM2;

    public String getNome(){
        return this.Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getEstado(){
        return this.Estado;
    }
    
    public void setEstado(String Estado){
        this.Estado = Estado;
    }

    public  Double getPrecom2(){
        return this.precoM2;
    }
    
    public void setPrecom2(Double precoM2){
        this.precoM2 = precoM2;
    }
}
