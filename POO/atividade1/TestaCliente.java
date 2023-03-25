package atividade1;

public class TestaCliente {

	public static void main(String[] args) {
		
		// Instanciando um objeto da classe Cliente:
		
		Cliente cliente1 = new Cliente("Maurilo", "maurilosantoss1@gmail.com", 26, 1000000000 , 119999999);
		
		cliente1.vizualizar();
		
		Cliente cliente2 = new Cliente("Bob Esponja", "calçaquadrada@gmail.com", 11, 2000000000 , 119299999);
		
		cliente2.vizualizar();
		
		
	}

}
