package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a 1a nota:");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a 2a nota:");
		double nota2 = sc.nextDouble();
		
		double nota_final = nota1 + nota2;
		
		if(nota_final < 60.0) {
			System.out.printf("Situação do aluno: REPROVADO\n NOTA FINAL = %.1f", nota_final);

		}
		else {
			System.out.printf("Situação do aluno: APROVADO\n NOTA FINAL = %.1f", nota_final);
		}
		
		sc.close();
	}
}
