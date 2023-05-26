package exercicioAbtracao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pessoaFisica pf = new pessoaFisica();
		
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Enter the nunber of taxes payers: ");
		int quant = sc.nextInt();
		
		for(int i=0;i<quant;i++) {
			
			System.out.println("\nTax payer #"+(i+1));
		
			System.out.println("Individual or company ? (i/c)");
			
			char choise = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("\nAnual income: ");
			Double income = sc.nextDouble();
			
			if(choise == 'i' || choise =='I') {
				System.out.print("\nHealth expenses: ");
				Double hex = sc.nextDouble();
				 
				list.add(new pessoaFisica(hex,name,income));
				
			}
			else if( choise == 'c' || choise =='C' ) {
				
				System.out.print("\nNumber of employees: ");
				int empl = sc.nextInt();
				Pessoa pj= new PessoaJuridica(empl,name,income);
				list.add(pj);
				
			}
				
		}
		
		
		
		System.out.println("TAXES PAID:\n");
		
		Double soma =0.0;
		for(Pessoa x : list) {
			
			
			soma += x.taxesCalc();
			
			System.out.println(x.toString());
			
		}
			System.out.println("\nTotal: "+soma);
			
			
		}	


	
	
		
	
	

}
