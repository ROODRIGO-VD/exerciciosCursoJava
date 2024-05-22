package curso_programacao;
import java.util.Scanner;
public class experiencias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n_experi, qtd_cobaias, total,rato, sapo, cobra;
		String tipo;
		double p_rato, p_sapo, p_cobra;
		
		System.out.print("Quantos casos testes serão digitados? ");
		n_experi = sc.nextInt();
		
		
		total = 0;
		rato = 0;
		sapo = 0;
		cobra = 0;
		for(int i = 1; i <= n_experi; i++) {
			
			System.out.print("Quantidade de cobaias: ");
			qtd_cobaias = sc.nextInt();
			System.out.print("Tipo de cobaias: ");
			tipo = sc.next();
			total += qtd_cobaias;
			
			if (tipo.equals("R")){
				rato += qtd_cobaias;
			}
			else if(tipo.equals("S")){
				sapo += qtd_cobaias;
			}
			else if(tipo.equals("C")) {
				cobra += qtd_cobaias;
			}
		}

	p_rato = ((double)rato / total ) * 100;	
	p_sapo = ((double)sapo / total ) * 100;
	p_cobra = ((double)cobra / total ) * 100;
	
	System.out.println("RELATÓRIO FINAL:");
	System.out.printf("Total Cobaias: %d cobaias.\n",total);
	System.out.printf("Total Ratos: %d ratos.\n",rato);
	System.out.printf("Total Sapos: %d sapos.\n",sapo);
	System.out.printf("Total Cobras: %d cobras.\n",cobra);
	System.out.printf("Percentual de Ratos: %.2f cobaias.\n",p_rato);
	System.out.printf("Percentual de Sapos: %.2f cobaias.\n",p_sapo);
	System.out.printf("Percentual de Cobras: %.2f cobaias.",p_cobra);
	}

}
