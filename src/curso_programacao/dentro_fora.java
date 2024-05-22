package curso_programacao;
import java.util.Scanner;
public class dentro_fora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,numero, dentro, fora;
		
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		dentro = 0;
		fora = 0;	
		
		for(int i=0; i < n; i++) {
				numero = sc.nextInt();

			
			if( numero < 10 || numero > 20) {
				fora++;
			}
			else {
				dentro++;
			}
		
		}
		
		System.out.printf("%d DENTRO\n",dentro);
		System.out.printf("%d FORA\n", fora);
		sc.close();
		

	}

}
