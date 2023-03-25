package atividade2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Instanciando um objeto da classe Cliente:
		
		Funcionario funcionario1 = new Funcionario("Maurilo", "Software Engineer", 150000 , 444444441 , 129999999);
		
		funcionario1.vizualizar();
		
		Funcionario funcionario2 = new Funcionario("Bob esponja", "Cloud Engineer", 550000 , 445444441 , 119999999);
		
		funcionario2.vizualizar();
	}

}
