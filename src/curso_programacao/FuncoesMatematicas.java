package curso_programacao;

import java.util.Locale;

public class FuncoesMatematicas {

	public static void main(String[] args) {
	//variables
		double x = 3.0, y= 4.0, z= -5.0;
		double A,B,C;
	// Raiz quadrada
		Locale.setDefault(Locale.US);
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada: ");
		System.out.printf("    Raiz quadrada de %.1f = %.1f\n", x, A);
		System.out.printf("    Raiz quadrada de %.1f = %.1f\n", y, B);
		System.out.printf("    Raiz quadrada de 25.0 = %.1f\n", C);
		 	
	//Potência
		A = Math.pow(x,y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("Potências: ");
		System.out.printf("    %.1f elevado a %.1f = %.1f\n", x, y, A);
		System.out.printf("    %.1f elevado a 2.0 = %.1f\n", x, B);
		System.out.printf("    5.0 elevado a 2.0 = %.1f\n", C);
	//Valor Absoluto
		A = Math.abs(x);
		B = Math.abs(z);
		System.out.println("Valor Absoluto");
		System.out.printf("    O valor absoluto de %.1f = %.1f\n", x, A);
		System.out.printf("     O valor absoluto de %.1f = %.1f", z, B);
		
	
	
	}

}
