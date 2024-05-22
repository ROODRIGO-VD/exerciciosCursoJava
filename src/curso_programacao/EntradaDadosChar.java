package curso_programacao;

import java.util.Scanner;

public class EntradaDadosChar {

	public static void main(String[] args) {
	//Variable
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		
		
	//Code
		System.out.println("Você digitou: "+ x);
		
		
		sc.close();
		

	}

}
