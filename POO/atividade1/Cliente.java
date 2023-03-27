package atividade1;

public class Cliente {
	//declaração dos atributos da classe
	
	private String nomeCliente;
	private String email;
	private int idade;
	private int cpf;
	private int telefone;
	
	//método construtor

	public Cliente(String nomeCliente, String email, int idade, int cpf, int telefone) {
		super();
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	// criando os métodos set e get pra cada atributo.
	
	public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
	
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    // método para visualizar todos os atributos do objeto da classe cliente: 
   
    public void visualizar() {
    	System.out.println("\n -----> Nome: "+nomeCliente);
    	System.out.println("\n -----> CPF: "+cpf);
    	System.out.println("\n -----> Idade: "+idade);
    	System.out.println("\n -----> E-mail: "+email);
    	System.out.println("\n -----> Telefone: "+telefone);
    	System.out.println("\n");
    }
	
	
	
	
}
