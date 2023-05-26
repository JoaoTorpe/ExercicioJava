package exercicioAbtracao;

public class pessoaFisica extends Pessoa {

	
	private Double gastoSaude;

	
	public  pessoaFisica() {
		
	}
	

	public pessoaFisica(Double gastoSaude , String name, Double value) {
		super(value,name);
		this.setNome(name);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public String toString() {
		return  getNome()+": $ "+taxesCalc() ;
	}


	@Override
	public Double taxesCalc() {
		
		if( getRendaAnual() < 20000) {
		
			return (getRendaAnual() * 0.15) - (gastoSaude * 0.5);
			
		
		
			
		}
		
		else {
			return (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
			
		}
		
		
		
	}
	
	
	

	

	
	
}
