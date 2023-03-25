package atividade5;



public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso("Billie Eilish", "Autódromom de Interlagos", "Show" , 222 , 12345);
		
		ingresso1.vizualizar();
		
		Ingresso ingresso2 = new Ingresso("Avatar 2", "Cinemark Shopping Interlagos", "Cinema" , 23 , 54321);
		
		ingresso2.vizualizar();
	}

}
