package curso_programacao;
import java.util.Scanner;
import java.util.Locale;
public class media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade,pessoas;
		double soma, media;
		
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		
		if(idade < 0 ) {
			System.out.println("IMPOSSÍVEL CALCULAR!!");
		}
		else {
			soma = 0;
			pessoas = 0;
			
			while(idade > 0) {
				soma += idade;
				pessoas++;
				idade = sc.nextInt();
			}
		media = soma / pessoas;
		System.out.printf("MEDIA = %.2f\n", media);
		}
		
		sc.close();
	}

}
