package atividade1;

public class TestaCliente {

	public static void main(String[] args) {
		
		// Instanciando dois objetos da classe PessoaFisica:
		
		PessoaFisica cliente1 = new PessoaFisica("Maurilo", "maurilosantoss1@gmail.com", 26, 1000000000 , 119999999, "maurilosantos");
		
		cliente1.vizualizar();
		
		PessoaFisica cliente2 = new PessoaFisica("Bob Esponja", "calçaquadrada@gmail.com", 11, 2000000000 , 119299999, "spongequadrada");
		
		cliente2.vizualizar();
		
		// Instanciando dois objetos da classe PessoaJuridica:
		
		PessoaJuridica cliente3 = new PessoaJuridica("Naruto Uzumaki", "hokage@gmail.com", 28, 0 , 119294499, "134.234.223-34");
		
		cliente3.vizualizar();
		
		PessoaJuridica cliente4 = new PessoaJuridica("Steve Jobs", "CEOApple@gmail.com", 55, 0 , 119797998, "765.234.343-66");
		
		cliente4.vizualizar();
		
	}

}
