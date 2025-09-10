{
    public static void main(String[] args) {
       
        Computador meuComputador = new Computador(16, 512, 8, 2.5f);
        
       
        SistemaOperacional sistema = new SistemaOperacional(meuComputador);
        
        System.out.println("=== ESPECIFICAÇÕES DO COMPUTADOR ===");
        System.out.println("Memória RAM: " + meuComputador.getmemoriaRam() + "GB");
        System.out.println("SSD: " + meuComputador.getSSD() + "GB");
        System.out.println("Núcleos: " + meuComputador.getNucleos());
        System.out.println("Operações por segundo: " + meuComputador.getoperacoesporSegundo() + " GHz");
        System.out.println("===================================\n");
        
      
        System.out.println("=== PROGRAMA 1 - EDITOR DE TEXTO ===");
        Programa editorTexto = new Programa(2, 5, 1, 1000000);
        sistema.executarPrograma(editorTexto);
        System.out.println();
        
       
        System.out.println("=== PROGRAMA 2 - JOGO PESADO ===");
        Programa jogoPesado = new Programa(8, 600, 4, 50000000);
        sistema.executarPrograma(jogoPesado);
        System.out.println();
        
       
        System.out.println("=== PROGRAMA 3 - SOFTWARE DE EDIÇÃO ===");
        Programa softwareEdicao = new Programa(32, 20, 6, 10000000);
        sistema.executarPrograma(softwareEdicao);
        System.out.println();
        
        
        System.out.println("=== PROGRAMA 4 - NAVEGADOR WEB ===");
        Programa navegador = new Programa(4, 2, 2, 2000000);
        sistema.executarPrograma(navegador);
    }
}
