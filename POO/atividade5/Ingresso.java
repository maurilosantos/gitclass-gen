package atividade5;

public class Ingresso {
	
	//declaração dos atributos da classe:

	private String show;
	private String local;
	private String categoria;
	private double valor;
	private int codigo;
	//método construtor:
	public Ingresso(String show, String local, String categoria, double valor, int codigo) {
		super();
		this.show = show;
		this.local = local;
		this.categoria = categoria;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	// criando os métodos set e get pra cada atributo:
	
	public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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
    	System.out.println("\n -----> Show: "+show);
    	System.out.println("\n -----> Local: "+local);
    	System.out.println("\n -----> Categoria: "+categoria);
    	System.out.println("\n -----> Valor: $"+valor);
    	System.out.println("\n -----> Codigo: "+codigo);
    	System.out.println("\n");
    }
	
	

}
