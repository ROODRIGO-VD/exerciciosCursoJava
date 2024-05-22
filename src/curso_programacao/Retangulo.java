package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//Base Retângulo
		System.out.print("Base do Retângulo:");
		double base = sc.nextDouble();
	//Altura do Retângulo
		System.out.print("Altura do Retângulo:");
		double altura = sc.nextDouble();
	//Cálculos
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diag1 = Math.pow(altura, 2.0) + Math.pow(base, 2.0);
		double diagonal = Math.sqrt(diag1);
	//Prints
		System.out.printf("Área = %.4f\n", area);
		System.out.printf("Perímetro = %.4f\n", perimetro);
		System.out.printf("Diagonal = %.4f\n", diagonal);
		
		sc.close();
	}

}
