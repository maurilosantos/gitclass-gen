package atividade4;

public class Farmacia {

			//declaração dos atributos da classe:

			private String nome;
			private String setor;
			private String categoria;
			private double valor;
			private int codigo;
			
			//método construtor:
			
			
			public Farmacia(String nome, String setor, String categoria, double valor, int codigo) {
				super();
				this.nome = nome;
				this.setor = setor;
				this.categoria = categoria;
				this.valor = valor;
				this.codigo = codigo;
			}
			
			
			// criando os métodos set e get pra cada atributo:
			
			public String getNome() {
		        return nome;
		    }

		    public void setNome(String nome) {
		        this.nome = nome;
		    }
		    
		    public String getSetor() {
		        return setor;
		    }

		    public void setFabricante(String setor) {
		        this.setor = setor;
		    }
		    
		    
		    public String getCategoria() {
		        return categoria;
		    }

		    public void setCategoria(String categoria) {
		        this.categoria = categoria;
		    }
		    
		    public double getValor() {
		        return valor;
		    }

		    public void setValor(double valor) {
		        this.valor = valor;
		    }
		    
		    public int getCodigo() {
		        return codigo;
		    }

		    public void setCodigo(int codigo) {
		        this.codigo = codigo;
		    }
		    
		    
		    public void vizualizar() {
		    	System.out.println("\n -----> Nome: "+nome);
		    	System.out.println("\n -----> Setor: "+setor);
		    	System.out.println("\n -----> Categoria: "+categoria);
		    	System.out.println("\n -----> Valor: $"+valor);
		    	System.out.println("\n -----> Codigo: "+codigo);
		    	System.out.println("\n");
		    }
			
		
}
