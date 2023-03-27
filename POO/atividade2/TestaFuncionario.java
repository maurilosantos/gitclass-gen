package atividade2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Instanciando dois objetos Gerentes da classe Funcionario:
		
		Gerente funcionario1 = new Gerente("Maurilo", "Senior Front End", 150000 , 444444441 , 129999999, "Barachel em Ciências da Computação");
		
		funcionario1.visualizar();
		
		Gerente funcionario2 = new Gerente("Bob esponja", "Senior Back End", 550000 , 122565434 , 119999999, "Barachel em Engenharia Civil");
		
		funcionario2.visualizar();
		
		// Instanciando dois objetos Vendedores da classe Vendedor:
		
		Vendedor funcionario3 = new Vendedor("Camila Albuquerque", "Vendedor de Calçados", 2600 , 445444441 , 119999999, 	"Esportivo");
		
		funcionario3.visualizar();
		
		Vendedor funcionario4 = new Vendedor("Lais Santos", "Vendedor de Roupas", 4000 , 122345434 , 119329999, 	"Casual");
		
		funcionario4.visualizar();
		
		
	}

}
