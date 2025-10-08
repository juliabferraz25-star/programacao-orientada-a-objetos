public class Usuario extends Pessoa {
    private int matricula;
    
    public Usuario(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Matrícula: " + matricula);
    }
    
    public int getMatricula() { return matricula; }
}