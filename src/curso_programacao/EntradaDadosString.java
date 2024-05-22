package curso_programacao;

import java.util.Scanner;

public class EntradaDadosString {

	public static void main(String[] args) {
	//Variables
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
	//Code
		System.out.println("Você digitou: " + x);
		
		
		sc.close();

	}

}
