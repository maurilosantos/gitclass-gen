package atividade2;

public class Funcionario {
	//declaração dos atributos da classe:

	private String nome;
	private String cargo;
	private double salario;
	private int cpf;
	private int telefone;
	
	
	//método construtor:

	public Funcionario(String nome, String cargo, double salario, int cpf, int telefone) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	// criando os métodos set e get pra cada atributo:
	
		public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    
	    public String getCargo() {
	        return cargo;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }
	    
	    
	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
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
	
	
	  
	
	
	
}
