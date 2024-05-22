package curso_programacao;
import java.util.Scanner;
import java.util.Locale;
public class validacao_nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Digite a 1a nota: ");
		nota1 = sc.nextDouble();
		
		while(nota1 < 0 || nota1 > 10 ) {
			System.out.print("Valor inválido, tente novamente!");
			nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a 2a nota: ");
		nota2 = sc.nextDouble();
		
		while(nota2 < 0 || nota2 > 10) {
			System.out.print("Valor inválido, tente novamente!");
			nota2 = sc.nextDouble();
		}
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("MEDIA = %.2f", media);
		
		
		sc.close();
	
		

	}

}
