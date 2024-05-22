package curso_programacao;

import java.util.Scanner;

public class EntradaDadosInt {

	public static void main(String[] args) {
	//Variable
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
	//Code
		System.out.println("Você digitou o número: "+ x);
		
		
		
		sc.close();

	}

}
