package atividade6;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Desenvolvedor Java", "Iniciante", "Back-End" , 100 , 25797);
		
		curso1.vizualizar();
		
		Curso curso2 = new Curso("Desenvolvedor React", "Avançado", "Front-End" , 200 , 34546);
		
		curso2.vizualizar();

	}

}
