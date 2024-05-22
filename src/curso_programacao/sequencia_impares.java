package curso_programacao;
import java.util.Scanner;
public class sequencia_impares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	
		int x;
		
		System.out.print("Digite dois valores: ");
		x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		
		
		
		
	
		sc.close();
	}	
	
	}
}	
