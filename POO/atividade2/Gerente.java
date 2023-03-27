package atividade2;

public class Gerente extends Funcionario{
	
	private String formacao;

	public Gerente(String nome, String cargo, double salario, int cpf, int telefone, String formacao) {
		super(nome, cargo, salario, cpf, telefone);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+getNome()+"\nCargo: "+getCargo()+"\nSalario: "+getSalario()+
				"\nCPF: "+getCpf()+"\nFormação: "+getFormacao()+"\n\n");
	}
	

}
