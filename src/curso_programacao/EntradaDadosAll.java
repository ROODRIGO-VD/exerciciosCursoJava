package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosAll {

	public static void main(String[] args) {
	//Variable
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		//y = sc.nextInt();
		//z = sc.nextDouble();
		
	//Code
		System.out.println(x);
		//System.out.printf(" O texto digitado foi: %s\n O número inteiro digitado foi: %d\n O número com ponto flutuante digitado foi: %f ", x, y, z);
		
		
		
		sc.close();
		

	}

}
