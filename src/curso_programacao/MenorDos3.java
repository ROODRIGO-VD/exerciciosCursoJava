package curso_programacao;
import java.util.Scanner;
public class MenorDos3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor:");
		int valor1 = sc.nextInt();
		
		System.out.print("Segundo valor:");
		int valor2 = sc.nextInt();
		
		System.out.print("Terceiro valor:");
		int valor3 = sc.nextInt();
		
		if(valor3 < valor2 && valor3 < valor1) {
			System.out.println("Valor 3 é o menor");
		}
		else if(valor2 < valor3 && valor2 < valor1) {
			System.out.println("Valor 2 é o menor");
		}
		else if(valor1 < valor3 && valor1 < valor2) {
			System.out.println("Valor 1 é o menor");
		}
		else {
			System.out.println("Valores iguais");
		}
		
		sc.close();
	}

}
