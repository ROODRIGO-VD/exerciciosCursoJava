package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//Largura
		System.out.print("Digite a largura do terreno: ");
		double larg = sc.nextDouble();
	//Comprimento
		System.out.print("Digite o Comprimento do terreno: ");
		double compri = sc.nextDouble();
	//Metro Quadrado
		System.out.print("Digite o valor do Metro Quadrado: ");
		double metro_quadr = sc.nextDouble();
	//Calculos
		double area = larg * compri;
		double preco = area * metro_quadr;
	//Prints
		System.out.printf("Área do terrno = %.2f\n", area);
		System.out.printf("Preço do terreno = %.2f", preco);
		
		
		sc.close();
	}

}
