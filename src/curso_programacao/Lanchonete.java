package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do produto comprado[1 à 5]:");
		int codigo = sc.nextInt();
		
		System.out.print("Quantidade comprada:");
		int qtd = sc.nextInt();
		
		if(codigo == 1) {
			double pagar = qtd * 5;
			System.out.printf("Valor a pagar: R$%.2f",pagar);
		}
		else if(codigo == 2){
			double pagar = qtd * 3.5;
			System.out.printf("Valor a pagar: R$%.2f",pagar);
		}
		else if(codigo == 3) {
			double pagar = qtd * 4.8;
			System.out.printf("Valor a pagar: R$%.2f",pagar);
		}
		else if(codigo == 4 ) {
			double pagar = qtd * 8.9;
			System.out.printf("Valor a pagar: R$%.2f",pagar);
		}
		else if(codigo == 5) {
			double pagar = qtd * 7.32;
			System.out.printf("Valor a pagar: R$%.2f",pagar);
		}
		
		sc.close();
		
	}

}
