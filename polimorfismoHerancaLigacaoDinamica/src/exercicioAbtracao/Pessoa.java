package exercicioAbtracao;

public abstract class Pessoa {

	private String nome;
	private Double rendaAnual;

	
	
	public Pessoa() {
		
	}
	
	public Pessoa( Double rendaAnual, String nome) {
				this.nome = nome;
				this.rendaAnual = rendaAnual;
	}


	 
	
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	abstract public Double taxesCalc();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
	
}
