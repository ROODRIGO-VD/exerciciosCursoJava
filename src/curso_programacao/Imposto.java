package curso_programacao;
import java.util.Locale;

import java.util.Scanner;
public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Salario < 3000 /MES - ISENTO
		//  3000 < Salario < 5000 /mes - 10%
		// > 5000 - 20%
		
		double maxAnual, maxPrestServ,
		maxGanCapi, gasMedic, gasEduc,
		salMes, maxDedut, gasDedut,impBruto,
		impDevid;
		
		System.out.print("Renda anual com salário:");
		maxAnual = sc.nextDouble();
		
		System.out.print("Renda anual com prestação de serviço:");
		maxPrestServ  = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital:");
		maxGanCapi = sc.nextDouble();
	
		System.out.print("Gastos médicos:");
		gasMedic = sc.nextDouble();
		
		System.out.print("Gastos educacionais:");
		gasEduc = sc.nextDouble();

		
		salMes = maxAnual / 12;
		
		
		if(salMes > 3000 && salMes < 5000) {
			maxAnual *= 0.1;
			
		}
		else if(salMes > 5000) {
			maxAnual *= 0.2;
		}
		else if(salMes < 3000){
			maxAnual *= 0;
		}
		if(maxPrestServ > 0) {
			maxPrestServ *= 0.15;
		}
		if(maxGanCapi > 0) {
			maxGanCapi *= 0.2;
		}
		
		gasDedut = gasMedic + gasEduc;
		maxDedut = (maxAnual + maxPrestServ + maxGanCapi) * 0.3;
		impBruto = maxAnual + maxPrestServ + maxGanCapi;
		impDevid = impBruto - maxDedut;
		
		if (gasDedut > maxDedut) {
			impBruto -= (maxAnual + maxPrestServ + maxGanCapi);
		}
		else {
			impBruto -= gasDedut;
		}
		impDevid = impBruto - maxDedut;
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA\n");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n", maxAnual);
		System.out.printf("Imposto sobre serviços: %.2f\n", maxPrestServ);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n\n", maxGanCapi);
		System.out.println("DEDUÇÕES:\n");
		System.out.printf("Máximo dedutível: %.2f\n", maxDedut);
		System.out.printf("Gastos dedutíveis: %.2f\n\n ",gasDedut);
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impBruto);
		System.out.printf("Abatimento: %.2f\n", maxDedut);
		System.out.printf("Imposto devido: %.2f", impDevid);
		
		
		sc.close();

	}

}
