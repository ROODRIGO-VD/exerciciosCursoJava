package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String classifi = "";
		System.out.print("Digite a medida da Glicose:");
		double medida = sc.nextDouble();
		
		if(medida <= 100) {
			classifi = "Normal";
		}
		else if (medida < 140) {
			classifi = "Elevado";
		}
		else {
			classifi = "Diabetes";
		}
		
		System.out.printf("Classificação: %s", classifi);
		
		
		sc.close();

	}

}
