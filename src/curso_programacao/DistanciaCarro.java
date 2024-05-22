package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaCarro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//Dados	
		System.out.print("Distância percorrida:");
		int distancia = sc.nextInt();
		System.out.print("Combustível gasto:");
		double combustivel = sc.nextDouble();
		
	//Calculos
		double consumo = distancia/combustivel;
	
	//Prints
		System.out.printf("Consumo médio = %.3f", consumo);
	
		
		sc.close();
	}

}
