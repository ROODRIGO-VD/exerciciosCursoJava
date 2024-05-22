package curso_programacao;
import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, resultado; 
		
		System.out.print("Deseja tabuada para qual valor? ");
		n = sc.nextInt();
		
		for(int i= 1; i< 11 ; i++  ) {
			
			resultado = n * i;
			
			System.out.printf("%d x %d= %d\n ", n, i, resultado);
			
		}
		
		
		
		sc.close();

	}

}
