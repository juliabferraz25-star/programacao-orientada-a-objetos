public class SistemaOperacional {
    private Computador computador;
    
    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }
    
    public boolean executarPrograma(Programa programa) {
        System.out.println("Tentando executar programa...");
        
        
        if (programa.getSSDOcupado() > computador.getSSD()) {
            System.out.println("ERRO: Espaço insuficiente no SSD!");
            System.out.println("SSD necessário: " + programa.getSSDOcupado() + "GB");
            System.out.println("SSD disponível: " + computador.getSSD() + "GB");
            return false;
        }
        
       
        if (programa.getmemoriaRamlocada() > computador.getMemoriaram()) {
            System.out.println("ERRO: Memória RAM insuficiente!");
            System.out.println("RAM necessária: " + programa.getmemoriaRamlocada() + "GB");
            System.out.println("RAM disponível: " + computador.getMemoriaram() + "GB");
            return false;
        }
        
       
        if (programa.getNucleos() > computador.getNucleos()) {
            System.out.println("ERRO: Núcleos insuficientes!");
            System.out.println("Núcleos necessários: " + programa.getNucleos());
            System.out.println("Núcleos disponíveis: " + computador.getNucleos());
            return false;
        }
        
      
        float tempoExecucao = programa.getquantidadedeOperacoes() / 
                             (computador.getoperacoesporSegundo() * computador.getNucleos());
        
        System.out.println(" Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos");
        System.out.println("Recursos utilizados:");
        System.out.println("- SSD: " + programa.getSSDOcupado() + "GB");
        System.out.println("- RAM: " + programa.getmemoriaRamlocada() + "GB");
        System.out.println("- Núcleos: " + programa.getNucleos());
        
        return true;
    }
    
    public Computador getComputador() {
        return computador;
    }
    
    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
}
