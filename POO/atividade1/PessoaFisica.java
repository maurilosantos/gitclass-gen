package atividade1;

public class PessoaFisica extends Cliente {
	
		private String instagram;
		// método construtor:
		public PessoaFisica(String nomeCliente, String email, int idade, int cpf, int telefone, String instagram) {
			super(nomeCliente, email, idade, cpf, telefone);
			this.instagram = instagram;
		}
		
		// gets e sets
		public String getInstagram() {
			return instagram;
		}
		public void setInstagram(String instagram) {
			this.instagram = instagram;
		}
		
		// método vizualizar todos os elementos da Pessoa Física:
		public void vizualizar() {
			System.out.println("Nome do cliente: "+getNomeCliente()+"\nEmail: "+getEmail()+"\nIdade: "+getIdade()+
					"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nInstagram: "+getInstagram()+"\n\n");
			
		}
		
		
		
		
		
		

}
