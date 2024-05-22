package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosDouble {

	public static void main(String[] args) {
	//Variable
		Locale.setDefault(Locale.US );
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		
	//Code
		System.out.println("Você digitou o número: "+ x); 
		
		sc.close();

	}

}
