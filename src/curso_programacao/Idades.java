package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Idades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//Dados 1a pessoa
		
		System.out.println("Dados da 1a pessoa:");
		System.out.print("Nome:");
		String nome1 = sc.nextLine();
		System.out.print("Idade:");
		int idade1 = sc.nextInt();
	//Dados 2a pessoa
		System.out.println("Dados da 2a pessoa:");
		System.out.print("Nome:");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Idade:");
		int idade2 = sc.nextInt();

	
	//Cálculos
		Locale.setDefault(Locale.US);
		double media = (double)(idade1 + idade2) / 2; 
	//Prints
		System.out.printf("A idade média de %s e %s é %.1f", nome1, nome2, media);
		
		sc.close();

	}

}
