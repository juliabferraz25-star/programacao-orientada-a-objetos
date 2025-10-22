public interface Colecao {

    String proprietario;
    Integer qitens;
    
    public void exibirInfo(){
        System.out.println("proprietario:" + this.proprietario);
        System.out.println("Itens:" + this.qitens);
    }
}
