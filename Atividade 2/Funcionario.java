public class Funcionario extends Pessoa {
    private String cargo;
    
    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }
    public String getCargo() { 
        return this.cargo;
    }

    public String getNome() { 
        return this.nome;
    }

     public String getEmail() { 
       return this.email;
    }

    
    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Cargo: " + cargo);
    }
    
    
}