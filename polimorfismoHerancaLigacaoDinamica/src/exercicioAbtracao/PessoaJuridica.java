package exercicioAbtracao;
import java.text.DecimalFormat;

public class PessoaJuridica extends Pessoa {
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	private Integer numeroFuncionarios;
	public char type = 'c' ;
	
	public PessoaJuridica() {
		
	}
	
	

	public PessoaJuridica(Integer numeroFuncionarios,String name, Double value) {
		super(value,name);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	
	@Override
	public String toString() {
		return  getNome()+": $ "+taxesCalc() ;
	}



	@Override
	public Double taxesCalc() {
		
		if(numeroFuncionarios > 10) {
			
			Double tax = getRendaAnual() * 0.14;
			return Double.parseDouble(decimalFormat.format(tax)); //Gambiarra para limitar casas decimais
		}
		else {
			
			Double tax = getRendaAnual() * 0.16;
		return Double.parseDouble(		decimalFormat.format(tax));//Gambiarra para limitar casas decimais
		}
		 
		
		
		
	}



	



	
	
	
	
}
