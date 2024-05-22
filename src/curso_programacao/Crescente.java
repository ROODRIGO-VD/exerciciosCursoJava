package curso_programacao;
import java.util.Scanner;
public class Crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			if(x > y) {
				System.out.println("Decrescente");
			}
			else {
				System.out.print("Crescente");
			}
			System.out.println("Digite outros dois valores:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
				
		sc.close();
		
		

	}

}
