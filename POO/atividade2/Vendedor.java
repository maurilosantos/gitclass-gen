package atividade2;

public class Vendedor extends Funcionario {
	private String setor;
	
	//construtor

	public Vendedor(String nome, String cargo, double salario, int cpf, int telefone, String setor) {
		super(nome, cargo, salario, cpf, telefone);
		this.setor = setor;
	}
	
	// gets e sets

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+getNome()+"\nCargo: "+getCargo()+"\nSalario: "+getSalario()+
				"\nCPF: "+getCpf()+"\nSetor de vendas: "+getSetor()+"\n\n");
	}
	
	
	
	
	
}
