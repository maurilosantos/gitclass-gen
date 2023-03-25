package atividade4;


public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia remedio1 = new Farmacia("Neosaldina", "Comprimidos", "Analgésico de dor" , 22 , 2345);
		
		remedio1.vizualizar();
		
		Farmacia remedio2 = new Farmacia("Vic Xarope", "Xaropes", "Tosse" , 30 , 3331);
		
		remedio2.vizualizar();
		

	}

}
